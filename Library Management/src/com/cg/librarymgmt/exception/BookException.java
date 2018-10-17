/*******Author Name: Christy JV Emp Id : 101484 Date: 24.5.2017 ******/
//Purpose: To define exceptions for invalid input

package com.cg.librarymgmt.exception;

public class BookException extends Exception 
{
	private static final long serialVersionUID = 1L;
	public BookException()
	{
		super();
	}
	public BookException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) 
	{
		super(message, cause, enableSuppression, writableStackTrace);
	}
	public BookException(String message, Throwable cause) 
	{
		super(message, cause);
	}
	public BookException(String message) 
	{
		super(message);			
	}
	public BookException(Throwable cause) 
	{
		super(cause);			
	}
}

