package com.practice.PizzaShop2.exception;

public class NoIngredientException extends Exception {

    String message;

    public NoIngredientException(String message) {
        this.message = message;
    }

    public String toString() {
        return "NoIngredientException Occured : " + message;
    }
}
