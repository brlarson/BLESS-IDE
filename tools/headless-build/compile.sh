#!/bin/bash
# Headless javac build of com.multitude.bless and com.multitude.bless.proof against an installed
# OSATE's plugins: a regression check for the A0 split (see README.md).
# Usage: compile.sh <outdir>
# Env:   OSATE_PLUGINS  plugins directory of an OSATE install (default: OSATE 2.14)
#        BLESS_IDE      BLESS-IDE checkout (default: this script's repo)
#        BLESS_PROOF    BLESS-proof checkout (default: sibling of BLESS_IDE)
set -u
OUT=${1:?usage: compile.sh <outdir>}; rm -rf "$OUT"; mkdir -p "$OUT"
HERE=$(cd "$(dirname "$0")" && pwd)
PL=${OSATE_PLUGINS:-/Applications/osate2.14.0.app/Contents/Eclipse/plugins}
IDE=${BLESS_IDE:-$(cd "$HERE/../.." && pwd)}
PRF=${BLESS_PROOF:-$(dirname "$IDE")/BLESS-proof}

# Xtext >= 2.36 annotation used by xtend-gen/ but absent from older xbase.lib jars
mkdir -p "$OUT/shim"
javac --release 21 -d "$OUT/shim" "$HERE/shim/org/eclipse/xtext/xbase/lib/XbaseGenerated.java" || exit 1

# newest bundle versions first; installed com.multitude bundles excluded so sources are what get tested
CP="$OUT/shim:$(find "$PL" -maxdepth 1 -name '*.jar' ! -name 'com.multitude*' ! -name '*.source_*' | sort -r | tr '\n' ':')"
for d in "$PL"/*/; do
  case "$d" in *com.multitude*) continue;; esac
  CP="$CP$d:"; [ -d "$d/bin" ] && CP="$CP$d/bin:"
  for j in "$d"*.jar "$d"lib/*.jar; do [ -f "$j" ] && CP="$CP$j:"; done
done
CP="$CP$IDE/com.multitude.aadl.bless/bin:$IDE/bless/lib/antlr-3.5.2-runtime.jar:$IDE/bless/lib/stringtemplate-3.2.1.jar:"

status=0
build() { # name srcdirs...
  local name=$1; shift; mkdir -p "$OUT/$name"
  find "$@" -name '*.java' > "$OUT/$name.files" 2>/dev/null
  javac --release 21 -nowarn -encoding UTF-8 -proc:none -Xmaxerrs 100000 -cp "$CP" -d "$OUT/$name" @"$OUT/$name.files" > "$OUT/$name.log" 2>&1
  local rc=$?; [ $rc -ne 0 ] && status=1
  echo "$name: $(wc -l < "$OUT/$name.files" | tr -d ' ') files, errors=$(grep -c ' error: ' "$OUT/$name.log")"
  CP="$CP$OUT/$name:"
}
build bless "$IDE/bless/src" "$IDE/bless/xtend-gen"
build proof "$PRF/com.multitude.bless.proof/src"
exit $status
