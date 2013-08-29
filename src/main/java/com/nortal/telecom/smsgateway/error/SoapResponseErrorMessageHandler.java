package com.nortal.telecom.smsgateway.error;

import org.springframework.ws.soap.client.SoapFaultClientException;

import com.nortal.telecom.smsgateway.error.exception.AlphanumericSenderNumberNotAllowedException;
import com.nortal.telecom.smsgateway.error.exception.ForbiddenCharactersInSenderNumberException;
import com.nortal.telecom.smsgateway.error.exception.InvalidCredentialsException;
import com.nortal.telecom.smsgateway.error.exception.InvalidSoapEnvelopeException;
import com.nortal.telecom.smsgateway.error.exception.MessageExceedsMaximumLengthAndContainsUnicodeException;
import com.nortal.telecom.smsgateway.error.exception.MessageExceedsMaximumLengthException;
import com.nortal.telecom.smsgateway.error.exception.NoSuchCustomerException;
import com.nortal.telecom.smsgateway.error.exception.NoSuchSenderNumberException;
import com.nortal.telecom.smsgateway.error.exception.ReceiverFormatException;
import com.nortal.telecom.smsgateway.error.exception.UCPMessageCreationException;

public class SoapResponseErrorMessageHandler {

	private enum ExceptionType {
		INVALID_CREDENTIALS(
				"org.apache.ws.security.WSSecurityException: General security error (WSSecurityEngine: Callback supplied no password for: "), INVALID_SOAP_ENVELOPE(
				"WSDoAllReceiver: cannot convert into document; nested exception is: java.lang.ClassCastException"), INVALID_RECEIVER_FORMAT(
				"org.apache.axis.types.URI$MalformedURIException: No scheme found in URI."), NO_SUCH_CUSTOMER_RECEIVE(
				"smsgw.soap.server.SoapCallException: No such customer:"), NO_SUCH_CUSTOMER_SEND(
				"SVC0002 - No such customer: "), ALPHANUMERIC_SENDER_NUMBER_NOT_ALLOWED(
				"SCV5038 - Alfanumeric messages not allowed: "), FORBIDDEN_CHARACTERS_IN_SENDER_NUMBER(
				"SVC0002 – Sender number contains forbidden character(s):"), MESSAGE_EXCEEDS_MAXIMUM_LENGTH_AND_CONTAINS_UNICODE(
				"SVC0280 - Message exceeds maximum length (message is Unicode)"), MESSAGE_EXCEEDS_MAXIMUM_LENGTH(
				"SVC0280 - Message exceeds maximum length"), NO_SUCH_SENDER_NUMBER(
				"SVC0004 - No such sender number: "), UCP_MESSAGE_CREATION_FAILURE(
				"SVC0001");

		private String text;

		ExceptionType(String text) {
			this.text = text;
		}

		public static ExceptionType fromString(String text) {
			if (text != null) {
				for (ExceptionType b : ExceptionType.values()) {
					if (text.indexOf(b.text) != -1) {
						return b;
					}
				}
			}
			return null;
		}

	}

	public static RuntimeException handle(SoapFaultClientException e) {
		String faultReason = e.getFaultStringOrReason();
		return createException(ExceptionType.fromString(faultReason));
	}

	public static RuntimeException handle(String result) {
		return createException(ExceptionType.fromString(result));
	}

	private static RuntimeException createException(ExceptionType exceptionType) {
		switch (exceptionType) {
		case INVALID_CREDENTIALS:
			return new InvalidCredentialsException();
		case INVALID_SOAP_ENVELOPE:
			return new InvalidSoapEnvelopeException();
		case INVALID_RECEIVER_FORMAT:
			return new ReceiverFormatException();
		case NO_SUCH_CUSTOMER_RECEIVE:
			return new NoSuchCustomerException();
		case NO_SUCH_CUSTOMER_SEND:
			return new NoSuchCustomerException();
		case ALPHANUMERIC_SENDER_NUMBER_NOT_ALLOWED:
			return new AlphanumericSenderNumberNotAllowedException();
		case FORBIDDEN_CHARACTERS_IN_SENDER_NUMBER:
			return new ForbiddenCharactersInSenderNumberException();
		case MESSAGE_EXCEEDS_MAXIMUM_LENGTH:
			return new MessageExceedsMaximumLengthException();
		case MESSAGE_EXCEEDS_MAXIMUM_LENGTH_AND_CONTAINS_UNICODE:
			return new MessageExceedsMaximumLengthAndContainsUnicodeException();
		case NO_SUCH_SENDER_NUMBER:
			return new NoSuchSenderNumberException();
		case UCP_MESSAGE_CREATION_FAILURE:
			return new UCPMessageCreationException();
		default:
			return new RuntimeException();
		}
	}

}
