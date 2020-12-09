package com.greenfox.gardenApp;

//      The Flower
//       - needs water if its current water amount is less then 5
//       - when watering it the flower can only absorb the 75% of the water
//       - eg. watering with 10 the flower's amount of water should only increase with 7.5

public class Flower extends Plants {
    double waterLoss = 0.75;
    int threshold = 5;

    public Flower(String color) {
        this.color = color;
    }

    public void needsWater() {
        if (currentWaterAmount < threshold) {
            System.out.println("The " + color + " Flower needs water");
        } else System.out.println("The " + color + " Flower doesn't needs water");
    }

    public void watering() {
        currentWaterAmount = waterDivided() * waterLoss;
    }

}
