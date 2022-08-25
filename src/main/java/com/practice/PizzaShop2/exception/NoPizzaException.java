package com.practice.PizzaShop2.exception;

public class NoPizzaException extends Exception {

    private String message;

    public NoPizzaException(String message) {
        this.message = message;
    }

    public String toString() {
        return "NoPizzaException Occured : " + message;
    }
}
