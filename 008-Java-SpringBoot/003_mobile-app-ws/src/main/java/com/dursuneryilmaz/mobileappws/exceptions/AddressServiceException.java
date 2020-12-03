package com.dursuneryilmaz.mobileappws.exceptions;

public class AddressServiceException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public AddressServiceException(String message) {
        super(message);
    }
}