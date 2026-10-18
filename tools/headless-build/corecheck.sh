#!/bin/bash
# Compile the planned OSATE-free core (A0) with NO org.osate, com.multitude.aadl, or Eclipse UI
# on the classpath. Every error is a remaining coupling; the goal is zero.
# Allowed: JDK, ANTLR 3 runtime, StringTemplate, EMF common/ecore.
# Usage: corecheck.sh <outdir>      (same env variables as compile.sh)
set -u
OUT=${1:?usage: corecheck.sh <outdir>}; rm -rf "$OUT"; mkdir -p "$OUT/classes"
HERE=$(cd "$(dirname "$0")" && pwd)
PL=${OSATE_PLUGINS:-/Applications/osate2.14.0.app/Contents/Eclipse/plugins}
IDE=${BLESS_IDE:-$(cd "$HERE/../.." && pwd)}
PRF=${BLESS_PROOF:-$(dirname "$IDE")/BLESS-proof}
CP="$IDE/bless/lib/antlr-3.5.2-runtime.jar:$IDE/bless/lib/stringtemplate-3.2.1.jar"
CP="$CP:$(ls "$PL"/org.eclipse.emf.common_*.jar | sort -r | head -1):$(ls "$PL"/org.eclipse.emf.ecore_*.jar | sort -r | head -1)"
B=$IDE/bless/src/com/multitude/bless; P=$PRF/com.multitude.bless.proof/src/com/multitude/bless/proof

# core = everything except the AADL front end (LoadBLESS, ToAST, ProcessComponent, osate/)
# and the Eclipse UI (Activator, handlers, ui/, util/SelectionHelper)
{
  ls "$B/BLESS.java" "$B/Parse.java"
  find "$B/app" "$B/exceptions" "$B/record" "$B/tree" "$B/antlr3generated" "$B/toPilar" -name '*.java'
  find "$B/symbol" -name '*.java' ! -name LoadBLESS.java
  find "$B/util" -name '*.java' ! -name SelectionHelper.java
  find "$P" -name '*.java' ! -path '*/handlers/*' ! -path '*/ui/*'
} > "$OUT/files"
javac --release 21 -nowarn -encoding UTF-8 -proc:none -Xmaxerrs 100000 -cp "$CP" -d "$OUT/classes" @"$OUT/files" > "$OUT/log" 2>&1
n=$(grep -c ' error: ' "$OUT/log")
echo "core files: $(wc -l < "$OUT/files" | tr -d ' ')  errors: $n"
echo "-- errors per file:"
grep ' error: ' "$OUT/log" | sed -E 's|^.*/(com/multitude/[^:]*):.*|\1|' | sort | uniq -c | sort -rn
echo "-- missing packages:"
sed -E -n 's/.*error: package (.*) does not exist/\1/p' "$OUT/log" | sort | uniq -c | sort -rn
[ "$n" -eq 0 ]
