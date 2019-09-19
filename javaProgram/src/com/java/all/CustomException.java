package com.java.all;

public class CustomException extends RuntimeException {

	public static final long serialVersionUID = -5819077496102727940L;

	public CustomException() {
		super();
	}

	public CustomException(String message) {
		super(message);
	}

	public CustomException(Throwable cause) {
		super(cause);
	}

	public CustomException(String message, Throwable cause) {
		super(message, cause);
	}

}
