package com.gbrlbarreto.helpdesk.services.exceptions;

public class DataIntegrityViolationExcepetion extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DataIntegrityViolationExcepetion(String message) {
        super(message);
    }

    public DataIntegrityViolationExcepetion(String message, Throwable cause) {
        super(message, cause);
    }

}
