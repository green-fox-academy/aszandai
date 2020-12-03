package com.greenfox.petrolStation;

public class Main {
    //- Create `Station` and `Car` classes
    //- `Station`
    //  - gasAmount
    //  - refill(car) -> decreases the gasAmount by the capacity of the car and
    //    increases the cars gasAmount
    //- `Car`
    //  - gasAmount
    //  - capacity
    //  - create constructor for `Car` where:
    //    - initialize gasAmount -> 0
    //    - initialize capacity -> 100

    public static void main(String[] args) {
        Car car = new Car();
        Station station = new Station();

        System.out.println("Current gas level of the car: " + car.gasAmount);
        station.refill(car);
        System.out.println("Refilled gas level of the car: " + car.gasAmount);
        System.out.println("Remaining gas at the station: " + station.gasAmount);
    }
}
