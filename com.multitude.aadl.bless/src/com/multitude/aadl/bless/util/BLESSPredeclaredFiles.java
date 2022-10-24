package com.multitude.aadl.bless.util;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BLESSPredeclaredFiles
  {

  private static final Set<String> PREDECLARED_BLESS_NAMES;

  static {
  HashSet<String> predeclaredBLESSNames = new HashSet<String>();
  predeclaredBLESSNames.add("SI");
  predeclaredBLESSNames.add("BLESS");
  predeclaredBLESSNames.add("BLESS_Types");
  predeclaredBLESSNames.add("BLESS_Properties");
  PREDECLARED_BLESS_NAMES = Collections.unmodifiableSet(predeclaredBLESSNames);
  }

  public static Set<String> getPredeclaredBLESSNames() {
  return PREDECLARED_BLESS_NAMES;
  }

  }
