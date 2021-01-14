package com.greenfoxacademy.foxclub.model;

import java.util.ArrayList;
import java.util.List;

public class FoxDrink {
    private List<String> foxDrinks;

    public FoxDrink() {
        foxDrinks = new ArrayList<>();
        foxDrinks.add("Coke");
        foxDrinks.add("Getorade");
        foxDrinks.add("Water");
    }

    public FoxDrink(List<String> foxDrinks) {
        this.foxDrinks = foxDrinks;
    }

    public List<String> getFoxDrinks() {
        return foxDrinks;
    }

    public void setFoxDrinks(List<String> foxDrinks) {
        this.foxDrinks = foxDrinks;
    }
}
