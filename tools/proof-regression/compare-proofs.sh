#!/bin/bash
# Compare BLESS Proof Assistant proof.txt files, ignoring what legitimately differs between runs:
# the two header lines (version, date, user) and the final "closing proof file <path>" line.
#
# Usage:
#   compare-proofs.sh EXPECTED.txt ACTUAL.txt        one pair; prints a unified diff when they differ
#   compare-proofs.sh -tree BASE_DIR NEW_DIR         every <model>/proof.txt under BASE_DIR vs NEW_DIR
#   compare-proofs.sh -committed MODELS_DIR NEW_DIR  every <model>/proof/proof.txt in BLESS-models vs NEW_DIR
# Exit status: 0 when everything compared is identical, 1 otherwise.
set -u

normalize() {  # file
  tr -d '\r' < "$1" | sed '1,2d' | grep -v '^closing proof file '
}

theorems() { grep -c '^Theorem (' "$1"; }

compare_pair() {  # expected actual label
  local exp=$1 act=$2 label=$3
  if [ ! -f "$exp" ]; then echo "SKIP   $label: no $exp"; return 0; fi
  if [ ! -f "$act" ]; then echo "MISSING $label: no $act"; return 1; fi
  local header_exp header_act
  header_exp=$(tr -d '\r' < "$exp" | sed -n '1s/.*Assistant //p')
  header_act=$(tr -d '\r' < "$act" | sed -n '1s/.*Assistant //p')
  if diff -q <(normalize "$exp") <(normalize "$act") > /dev/null; then
    echo "SAME   $label: $(theorems "$act") theorems ($header_exp vs $header_act)"
    return 0
  fi
  echo "DIFF   $label: $(theorems "$exp") vs $(theorems "$act") theorems ($header_exp vs $header_act)"
  [ -n "${VERBOSE:-}" ] && diff -u --label "expected/$label" --label "actual/$label" \
    <(normalize "$exp") <(normalize "$act") | head -${DIFF_LINES:-80}
  return 1
}

case "${1:-}" in
  -tree)
    base=${2:?BASE_DIR}; new=${3:?NEW_DIR}; status=0
    for d in "$base"/*/; do
      m=$(basename "$d")
      compare_pair "$base/$m/proof.txt" "$new/$m/proof.txt" "$m" || status=1
    done
    exit $status ;;
  -committed)
    models=${2:?MODELS_DIR}; new=${3:?NEW_DIR}; status=0
    for p in "$models"/*/proof/proof.txt; do
      m=$(basename "$(dirname "$(dirname "$p")")")
      compare_pair "$p" "$new/$m/proof.txt" "$m" || status=1
    done
    exit $status ;;
  -h|--help|"")
    sed -n '2,10p' "$0"; exit 2 ;;
  *)
    VERBOSE=1 compare_pair "${1}" "${2:?ACTUAL.txt}" "$(basename "$(dirname "$2")")/$(basename "$2")" ;;
esac
