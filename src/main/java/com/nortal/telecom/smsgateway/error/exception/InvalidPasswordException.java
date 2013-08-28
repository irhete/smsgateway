package com.nortal.telecom.smsgateway.error.exception;

public class InvalidPasswordException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidPasswordException() {
		super();
	}

	public InvalidPasswordException(String message) {
		super(message);
	}

	public InvalidPasswordException(Throwable cause) {
		super(cause);
	}
}
