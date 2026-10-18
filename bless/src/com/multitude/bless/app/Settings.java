//Settings.java

package com.multitude.bless.app;

/**
 * @author brl
 * BLESS configuration settings read by the parser and proof engine.
 * Has no Eclipse dependency so the core can run outside OSATE.
 * When running as a plugin, Activator.start() installs a Provider that reads
 * the Eclipse preference store (see ConfigurationPreferencePage);
 * otherwise the defaults below are used.
 */
public class Settings
{

/**
 * source of setting values
 */
public interface Provider
  {
  boolean getMakeNewProjectsWhenFlattening();
  boolean getVerboseParse();
  boolean getVerboseProof();
  boolean useEpithet();
  boolean showUnparsed();
  boolean showVC();
  String getSlangDirectory();
  String getBADirectory();
  boolean getContinuum();
  }  //end of Provider

/**
 * defaults, matching PreferenceInitializer
 */
public static class Defaults implements Provider
  {
  @Override public boolean getMakeNewProjectsWhenFlattening() { return true; }
  @Override public boolean getVerboseParse() { return false; }
  @Override public boolean getVerboseProof() { return false; }
  @Override public boolean useEpithet() { return false; }
  @Override public boolean showUnparsed() { return false; }
  @Override public boolean showVC() { return false; }
  @Override public String getSlangDirectory() { return ""; }
  @Override public String getBADirectory() { return ""; }
  @Override public boolean getContinuum() { return false; }
  }  //end of Defaults

private static Provider provider = new Defaults();

public static void setProvider(Provider p)
  {
  provider = (p==null) ? new Defaults() : p;
  }  //end of setProvider

public static Provider getProvider() { return provider; }

public static boolean getMakeNewProjectsWhenFlattening() { return provider.getMakeNewProjectsWhenFlattening(); }
public static boolean getVerboseParse() { return provider.getVerboseParse(); }
public static boolean getVerboseProof() { return provider.getVerboseProof(); }
public static boolean useEpithet() { return provider.useEpithet(); }
public static boolean showUnparsed() { return provider.showUnparsed(); }
public static boolean showVC() { return provider.showVC(); }
public static String getSlangDirectory() { return provider.getSlangDirectory(); }
public static String getBADirectory() { return provider.getBADirectory(); }
public static boolean getContinuum() { return provider.getContinuum(); }

}  //end of Settings
