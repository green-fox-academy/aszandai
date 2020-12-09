package com.greenfoxacademy.flyable;

public abstract class Vehicle {
    String name;
    Integer maxSpeed;
    int numberOfDoors;

    public static void main(String[] args) {
        Helicopter helicopter1 = new Helicopter();
//        Vehicle vehicle = new Vehicle(); - Not possible, because 'Vehicle' class is abstract.

        helicopter1.name = "Tropic Thunder";
        helicopter1.takeOff();
        helicopter1.fly();
        helicopter1.land();


    }
}
