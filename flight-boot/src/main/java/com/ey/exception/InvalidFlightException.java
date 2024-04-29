package com.ey.exception;

public class InvalidFlightException extends RuntimeException {

	public InvalidFlightException() {
	}

	public InvalidFlightException(String message) {

		super(message);
	}

}
