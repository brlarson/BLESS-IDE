package com.multitude.aadl.bless.exception;

import com.multitude.aadl.bless.BlessControl;

public class ParseException extends Exception
  {

  private static final long serialVersionUID = 411598729364317721L;

  public ParseException()
    {
    // TODO Auto-generated constructor stub
    }

  public ParseException(String message)
    {
    super(message);
    // TODO Auto-generated constructor stub
    }

  public ParseException(Throwable cause)
    {
    super(cause);
    // TODO Auto-generated constructor stub
    }

  public ParseException(String message, Throwable cause)
    {
    super(message, cause);
    // TODO Auto-generated constructor stub
    }

  public ParseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
    {
    super(message, cause, enableSuppression, writableStackTrace);
    // TODO Auto-generated constructor stub
    }

  public void handleException()
    {
    BlessControl.println("Parse Exception:  "+getMessage());
    }
  
}
