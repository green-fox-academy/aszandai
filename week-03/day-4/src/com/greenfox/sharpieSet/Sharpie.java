package com.greenfox.sharpieSet;

public class Sharpie {
    public String color;
    float width;
    float inkAmount;

    public Sharpie(String color, float width, float inkAmount) {
        this.color = color;
        this.width = width;
        this.inkAmount = inkAmount;
    }

    public void use() {
        inkAmount = inkAmount - 8;
        System.out.println("Current " + color + " ink amount is: " + inkAmount);
    }

    public boolean usable() {
        return !(inkAmount <= 0);
    }
}