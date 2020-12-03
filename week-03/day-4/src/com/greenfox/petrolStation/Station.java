package com.greenfox.petrolStation;

public class Station {
    int gasAmount = 5000;

    public void refill(Car car) {
        this.gasAmount = this.gasAmount - (car.capacity - car.gasAmount);
        car.gasAmount = car.capacity;
    }
}
