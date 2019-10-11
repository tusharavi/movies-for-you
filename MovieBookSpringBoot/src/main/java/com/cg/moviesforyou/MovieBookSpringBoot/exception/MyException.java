package com.cg.moviesforyou.MovieBookSpringBoot.exception;

public class MyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7872055658264168693L;

	public MyException() {
		super();
	}

	public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MyException(String message, Throwable cause) {
		super(message, cause);
	}

	public MyException(String message) {
		super(message);
	}

	public MyException(Throwable cause) {
		super(cause);
	}

}
