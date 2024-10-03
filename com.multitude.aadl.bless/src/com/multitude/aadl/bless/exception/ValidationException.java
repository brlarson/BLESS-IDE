package com.multitude.aadl.bless.exception;

import com.multitude.aadl.bless.BlessControl;

public class ValidationException extends Exception
  {

  private static final long serialVersionUID = 411598729364317722L;

  public ValidationException()
    {
    }

  public ValidationException(String message)
    {
    handleException(message);
//    super(message);
    }

  public ValidationException(Throwable cause)
    {
    super(cause);
    }

  public ValidationException(String message, Throwable cause)
    {
    super(message, cause);
    handleException(message);
    }

  public ValidationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
    {
    super(message, cause, enableSuppression, writableStackTrace);
    handleException(message);
    }

  public void handleException()
    {
    BlessControl.println("Validation Exception:  "+getMessage());
    printStackTrace();
//    BlessControl.println(this.toString());
    System.err.println(this.toString());
    }

  public void handleException(String s)
    {
    BlessControl.println("Validation Exception:  "+s);
    printStackTrace();
//    BlessControl.println(this.toString());
    System.err.println(this.toString());
    }
  
}
