package com.nortal.telecom.smsgateway.error.exception;

public class NoSuchCustomerException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NoSuchCustomerException() {
		super();
	}

	public NoSuchCustomerException(String message) {
		super(message);
	}

	public NoSuchCustomerException(Throwable cause) {
		super(cause);
	}
}
