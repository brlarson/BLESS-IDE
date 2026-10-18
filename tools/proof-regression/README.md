# Proof-level regression for A0

A0 (`a0/osate-free-core` in BLESS-IDE and BLESS-proof) is a refactor: it moved OSATE- and
Eclipse-specific code behind interfaces and changed no proof logic. The headless checks
(`tools/headless-build`) show that it compiles. This procedure shows that it **proves the same
things**: every BLESS-models proof script replayed on the a0 branches must produce the same
`proof.txt` as on `master`.

## Why compare against a fresh `master` run, not the committed `proof.txt`

The committed proofs in `~/git3/BLESS-models/*/proof/proof.txt` were made by v3.1 through v3.2.4
(2021–2024); `master` is v3.2.5. Differences between them and an a0 run could be older version
drift. So run every model on `master` first, on the same OSATE, and compare a0 against that.
The committed files are a second, informational check.

## Files the Proof Assistant writes

When a script reaches **Q.E.D.**, `Strategy.finishUpTheorems()` writes `proof.txt` to the
runtime Eclipse's **working directory**, together with `script.txt` and `dump.txt`. The BLESS
console shows where they went:

```
opening proof file "/…/proof.txt" <date>
```

The VVI proof's last line shows `/Applications/osate2_2023-03-master/Eclipse.app/Contents/MacOS/`.
Your runtime launch may use another directory. Every run **overwrites** these files, so save them
with `collect.sh` after each model.

## Scripts

| Script | Does |
|---|---|
| `collect.sh RESULTS BRANCH MODEL [RUN_DIR]` | copies `proof.txt`, `script.txt`, `dump.txt` from RUN_DIR (or `$BLESS_RUN_DIR`) to `RESULTS/BRANCH/MODEL/` |
| `compare-proofs.sh -tree RESULTS/master RESULTS/a0` | compares every model; `SAME`/`DIFF`/`MISSING` per model; exit 0 only if all are the same |
| `compare-proofs.sh A.txt B.txt` | one pair, with a unified diff (`DIFF_LINES=` sets its length, default 80) |
| `compare-proofs.sh -committed ~/git3/BLESS-models RESULTS/a0` | a0 vs the committed proofs (informational) |

The comparison ignores only the two header lines (version, date, user) and the final
`closing proof file "<path>"` line. Theorem numbers, serial numbers, line numbers, and every
reason must match.

## Models

Run them in this order: small first, then the ones that exercise what A0 changed most.

| # | Model | Top script | System implementation (its committed instance model) | Saved proof | What it exercises |
|---|---|---|---|---|---|
| 1 | VVI | `proof script/VVI.ps` | `aadl/packages/instances/VVI_PG_i_Instance.aaxl2` | 303 theorems, v3.2.2 | thread VCs, `BLESS::Invariant`, small |
| 2 | Timeout | `proof script/tpwoc.ps`, then `tpwc.ps`, then `tpstamp.ps` (see note) | *(no instance committed; use the one you used before)* | 445, v3.1.5 | timeout dispatch, periodic threads |
| 3 | CTCS-3 | `proof/CTCS3.ps` | `aadl/packages/instances/Train_Train_i_Instance.aaxl2` | 391, v3.2.2 | |
| 4 | IoMT | `proofscripts/IoMT_Master.ps` (runs 4 subscripts) | `aadl/packages/instances/IoMTwin_SysIoMT_impl_Instance.aaxl2` | 677, v3.2.4 | **composition**: connection assume-guarantee and composite invariants (`AadlComposition`) |
| 5 | DDD | `proof script/DDD.ps` | `aadl/packages/instances/PG_Pacemaker_imp_Instance.aaxl2` | 665, v3.2.1 | timing (`@`, `now`) |
| 6 | PO-SA | `proof script/PO.ps` | `aadl/packages/instances/PO_ICEpoSystem_imp_Instance.aaxl2` | 1729, v3.2.2 | periodic threads, quantification |
| 7 | Isolette-classic | `proof scripts/Isolette.ps` | `aadl/packages/instances/Nursery_Room_Normal_Operation_Instance.aaxl2` | 2733, v3.2.0 | periodic threads, `x'` |
| 8 | Stepper | `proof scripts/stepper.ps` | `packages/instances/PositionControl_PositionControlSystem_RobustSingleStep_Instance.aaxl2` | 3443, v3.1 | subprogram Pre/Post, invocation, connections |
| 9 | DDDRwE | `proof-scripts/DDDwE.ps` | `packages/instances/PACEMAKER_PG_imp_Instance.aaxl2` | 4369, v3.1.5 | largest; composition, `tops` |

**Timeout note:** `timeout.ps` uses the old `subscript tpwoc.ps` form. v3.2.5 reads sub-script
names as `subscript[…]` (`Strategy` takes `substring(10, length-1)`), so it would look for
`tpwoc.p` and fail, on `master` as well as on a0. Instead, run the three scripts it lists one
after another (**get new script** / **run proof script** for each) and collect after the last
one reaches Q.E.D. Do the same on both branches.

CTCS (dumps only) and Subprograms (no saved proof) are optional. If you run them, compare
master against a0 the same way.

## Procedure

### 0. Setup

Copy the scripts out of the repo first, because step 1 switches BLESS-IDE to `master`, where this
folder does not exist:

```bash
mkdir -p ~/bless-regression/bin && cp ~/git2/BLESS-IDE/tools/proof-regression/*.sh ~/bless-regression/bin/
```

```bash
export PATH="$HOME/bless-regression/bin:$PATH"
```

The runtime OSATE's workspace needs the BLESS-models projects (as you already have them).

### 1. Baseline on `master`

1. Switch both repos:
   ```bash
   git -C ~/git2/BLESS-IDE switch master
   ```
   ```bash
   git -C ~/git2/BLESS-proof switch master
   ```
2. In your plugin-development Eclipse: **Refresh** the projects, then **Project → Clean… → Clean
   all projects** (stale classes stay in the untracked `bin/` folders otherwise).
3. Launch the runtime OSATE as usual. Check the BLESS console's first lines for the version (`v3.2.5`).
4. For each model in the table, in order:
   1. Open the model's AADL package. In the **Outline**, right-click the system implementation →
      **Generate BLESS Verification Conditions**.
   2. **BLESS → Commands → get new script**, then choose the model's top script.
   3. **BLESS → Commands → run proof script**. Wait for `All proof obligations have been solved.  Q.E.D.`
      Scripts stop at a `stop` command or after three tactics in a row do nothing. If one stops
      short of Q.E.D., run it again; if it still won't finish, note it and treat that model as
      non-comparable.
   4. Save the result (RUN_DIR is the directory in the `opening proof file` console line):
      ```bash
      collect.sh ~/bless-regression master VVI /path/to/RUN_DIR
      ```
5. Optional, for the cleanest comparison: restart the runtime OSATE between models. Whatever you
   choose, do the a0 run **the same way, in the same order**.

**Known `master` issue:** `master` lacks the `BLESS::Invariant` null guard. If generating VCs
throws a `NullPointerException` at `GenerateVC`'s `acceptsProperty` line, re-type your one-line
guard for the baseline run only: put `(blessInvariant!=null)&&` before
`((NamedElement) tr.context).acceptsProperty(blessInvariant)`. Discard the edit before switching
to a0:

```bash
git -C ~/git2/BLESS-proof restore com.multitude.bless.proof/src/com/multitude/bless/proof/GenerateVC.java
```

On a0, the same check is in `AadlComponentContext.getInvariantPropertyValue()`.

### 2. The same on `a0/osate-free-core`

1. Switch both repos:
   ```bash
   git -C ~/git2/BLESS-IDE switch a0/osate-free-core
   ```
   ```bash
   git -C ~/git2/BLESS-proof switch a0/osate-free-core
   ```
2. **Refresh**, then **Project → Clean… → Clean all projects**. This matters on a0, because classes
   moved packages (for example, `tree.WriteSignalFile` became `ui.WriteSignalFile`).
   The Xtend builder regenerates `bless/xtend-gen/…/ToAST.java` from `ToAST.xtend`. If git then
   shows it as modified, look at the diff: the hand-edit (`new BAST(new AadlSourceRef(e))`) should
   match what Xtend emits, apart from formatting.
3. Relaunch the runtime OSATE and repeat step 1.4 for every model, saving with branch name `a0`:
   ```bash
   collect.sh ~/bless-regression a0 VVI /path/to/RUN_DIR
   ```

### 3. Compare

```bash
compare-proofs.sh -tree ~/bless-regression/master ~/bless-regression/a0
```

**Expected: every model `SAME`.** Then, for information only:

```bash
compare-proofs.sh -committed ~/git3/BLESS-models ~/bless-regression/a0
```

### 4. Check the UI paths A0 rerouted (in the a0 runtime)

These don't show up in `proof.txt`, but A0 moved them behind interfaces:

| Check | Moved in | Expect |
|---|---|---|
| BLESS console shows output | cut 4 (`Dump` → `UiServices.println`) | same console messages as on `master` |
| **get new script** opens a file dialog, and sub-scripts are found | cut 4 (`Strategy` → `chooseFileToOpen`) | same dialog; `subscript[…]` paths resolve |
| unparsing works (assertions print in proofs) | cut 4 (`Resources` for `BLESS3.stg`) | no template-loading errors at startup |
| unasserted connections get info markers in **Problems** (e.g. IoMT, DDDRwE) | cuts 2 and 5 (`Reporter`, `AadlComposition`) | same markers, same messages, on the same elements |
| proof errors put error markers on the source line | cut 2 (`ProofException` → `Reporter`) | marker on the right line |
| parse-tree windows open (e.g. on a proof error) | cut 3 (`UiServices.showTree`) | SWT tree window, as before |
| message boxes appear (e.g. **reload model** with nothing selected) | cut 3 (`UiServices.showMessage`) | same dialog |
| periodic threads get periodic dispatch VCs (Isolette, PO-SA, Stepper) | cut 3 (`ComponentContext`) | covered by `proof.txt` |

### 5. If a model differs

1. Look at the first difference:
   ```bash
   DIFF_LINES=200 compare-proofs.sh ~/bless-regression/master/IoMT/proof.txt ~/bless-regression/a0/IoMT/proof.txt
   ```
2. Re-run just that model on both branches after a fresh start. This rules out leftover state from
   the models before it.
3. Compare the saved `dump.txt` files near the first differing obligation. The verification
   conditions are printed when created if **Show verification conditions when created** is on in
   the BLESS preferences.
4. Send me the model name, the first diff hunk, and the matching `dump.txt` lines.
