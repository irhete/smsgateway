package com.nortal.telecom.smsgateway.error.exception;

public class InvalidSoapEnvelopeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidSoapEnvelopeException() {
		super();
	}

	public InvalidSoapEnvelopeException(String message) {
		super(message);
	}

	public InvalidSoapEnvelopeException(Throwable cause) {
		super(cause);
	}
}
