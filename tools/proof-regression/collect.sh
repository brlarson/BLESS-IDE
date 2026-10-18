#!/bin/bash
# Save the proof.txt (plus script.txt and dump.txt, for diagnosing differences) that a proof run
# just wrote, before the next run overwrites them.
#
# Usage: collect.sh RESULTS_DIR BRANCH MODEL [RUN_DIR]
#   RUN_DIR is where the runtime OSATE wrote its files: the directory in the
#   'opening proof file "..."' line on the BLESS console. Default: $BLESS_RUN_DIR.
# Example: collect.sh ~/bless-regression master VVI /Applications/osate2.14.0.app/Contents/MacOS
set -u
results=${1:?RESULTS_DIR}; branch=${2:?BRANCH}; model=${3:?MODEL}
run=${4:-${BLESS_RUN_DIR:?give RUN_DIR or set BLESS_RUN_DIR}}
out="$results/$branch/$model"
[ -f "$run/proof.txt" ] || { echo "no proof.txt in $run (did the proof reach Q.E.D.?)"; exit 1; }
mkdir -p "$out"
for f in proof.txt script.txt dump.txt; do
  [ -f "$run/$f" ] && cp -p "$run/$f" "$out/$f"
done
echo "saved to $out: $(grep -c '^Theorem (' "$out/proof.txt") theorems; $(sed -n 1p "$out/proof.txt" | tr -d '\r')"
