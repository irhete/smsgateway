package com.nortal.telecom.smsgateway.error;

import org.springframework.ws.soap.client.SoapFaultClientException;

import com.nortal.telecom.smsgateway.error.exception.InvalidCredentialsException;
import com.nortal.telecom.smsgateway.error.exception.InvalidSoapEnvelopeException;
import com.nortal.telecom.smsgateway.error.exception.NoSuchCustomerException;
import com.nortal.telecom.smsgateway.error.exception.ReceiverFormatException;

public class SoapFaultExceptionHandler {

	private enum ExceptionType {
		INVALID_PASSWORD(
				"WSDoAllReceiver: security processing failed; nested exception is: org.apache.ws.security.WSSecurityException: General security error (WSSecurityEngine: Callback supplied invalid or no password for: USERNAME)"), INVALID_SOAP_ENVELOPE(
				"WSDoAllReceiver: cannot convert into document; nested exception is: java.lang.ClassCastException"), INVALID_RECEIVER_FORMAT(
				"org.apache.axis.types.URI$MalformedURIException: No scheme found in URI."), NO_SUCH_CUSTOMER(
				"smsgw.soap.server.SoapCallException: No such customer:.");

		private String text;

		ExceptionType(String text) {
			this.text = text;
		}

		public static ExceptionType fromString(String text) {
			if (text != null) {
				for (ExceptionType b : ExceptionType.values()) {
					if (text.equalsIgnoreCase(b.text)) {
						return b;
					}
				}
			}
			return null;
		}

	}

	public static RuntimeException handle(SoapFaultClientException e) {
		String code = e.getFaultStringOrReason();
		return createException(ExceptionType.fromString(code));
	}

	private static RuntimeException createException(ExceptionType exceptionType) {
		switch (exceptionType) {
		case INVALID_PASSWORD:
			return new InvalidCredentialsException();
		case INVALID_SOAP_ENVELOPE:
			return new InvalidSoapEnvelopeException();
		case INVALID_RECEIVER_FORMAT:
			return new ReceiverFormatException();
		case NO_SUCH_CUSTOMER:
			return new NoSuchCustomerException();
		default:
			return null;
		}
	}

}
