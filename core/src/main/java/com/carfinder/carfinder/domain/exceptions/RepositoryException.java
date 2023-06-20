package com.carfinder.carfinder.domain.exceptions;


public class RepositoryException extends RuntimeException {
    public RepositoryException(String message, Throwable e) {
        super(message, e);
    }

    public RepositoryException(String message) {
        super(message);
    }
}
