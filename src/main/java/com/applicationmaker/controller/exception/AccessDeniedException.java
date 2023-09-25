package com.applicationmaker.controller.exception;

public class AccessDeniedException extends Exception {
    private String message;

    public AccessDeniedException() {
        message = "AccessDenied !!!";
    }

    public AccessDeniedException(String message) {
        super(message);
        this.message = message;
    }
}
