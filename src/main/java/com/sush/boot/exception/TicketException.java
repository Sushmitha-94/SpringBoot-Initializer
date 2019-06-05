package com.sush.boot.exception;

public class TicketException extends RuntimeException {
    String message;

    public TicketException(String message){
        this.message=message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
