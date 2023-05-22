package com.mars.exception;

public class InvalidEntryException extends IllegalArgumentException {
    public InvalidEntryException(String message) {
        super(message);
    }
}
