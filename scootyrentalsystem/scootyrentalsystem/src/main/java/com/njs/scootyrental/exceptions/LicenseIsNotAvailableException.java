package com.njs.scootyrental.exceptions;

public class LicenseIsNotAvailableException extends Exception{

    public LicenseIsNotAvailableException(String userIsNot) {
        super(userIsNot);
    }
}
