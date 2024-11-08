package org.ecommercebackend.exception;

public class ResourceNotFoundException extends Exception{
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResourceNotFoundException() {
    }

    public ResourceNotFoundException(String message) {
        this.message = message;
    }
}
