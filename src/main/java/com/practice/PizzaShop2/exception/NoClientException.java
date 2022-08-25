package com.practice.PizzaShop2.exception;

public class NoClientException extends Exception {

    private String message;

    public NoClientException(String message) {
        this.message = message;
    }

    public String toString() {
        return "NoClientException Occured: " + message;
    }
}
