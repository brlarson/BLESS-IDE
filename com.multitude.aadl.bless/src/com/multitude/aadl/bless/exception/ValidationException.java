package com.multitude.aadl.bless.exception;

import com.multitude.aadl.bless.BlessControl;

public class ValidationException extends Exception
  {

  private static final long serialVersionUID = 411598729364317722L;

  public ValidationException()
    {
    // TODO Auto-generated constructor stub
    }

  public ValidationException(String message)
    {
    super(message);
    // TODO Auto-generated constructor stub
    }

  public ValidationException(Throwable cause)
    {
    super(cause);
    // TODO Auto-generated constructor stub
    }

  public ValidationException(String message, Throwable cause)
    {
    super(message, cause);
    // TODO Auto-generated constructor stub
    }

  public ValidationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
    {
    super(message, cause, enableSuppression, writableStackTrace);
    // TODO Auto-generated constructor stub
    }

  public void handleException()
    {
    BlessControl.println("Validation Exception:  "+getMessage());
    printStackTrace();
    }
  
}
