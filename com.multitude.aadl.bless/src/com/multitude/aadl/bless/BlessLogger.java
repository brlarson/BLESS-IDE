//BlessLogger.java

package com.multitude.aadl.bless;

  import org.eclipse.core.runtime.ILog;
  import org.eclipse.core.runtime.Platform;
  import org.eclipse.core.runtime.Status;
  import org.osgi.framework.Bundle;
  import org.osgi.framework.FrameworkUtil;

public class BlessLogger
  {
   private static final Bundle BUNDLE = FrameworkUtil.getBundle(BlessLogger.class);
   private static final ILog LOGGER = Platform.getLog(BUNDLE);

   public static void log(String msg) {
      log(msg, null);
   }

   public static void log(String msg, Exception e) {
      LOGGER.log(new Status((e==null?Status.INFO:Status.ERROR), BUNDLE.getSymbolicName(), msg, e));
   }

  }
