package com.greenfoxacademy.flyable;

public class Helicopter extends Vehicle implements Flyable{

    @Override
    public void land() {
        System.out.println("The " + name + " is landing");
    }

    @Override
    public void fly() {
        System.out.println("The " + name + " is currently flying");

    }

    @Override
    public void takeOff() {
        System.out.println("The " + name + " is taking off");

    }
}
