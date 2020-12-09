package com.greenfox.gardenApp;

//      The Tree
//       - needs water if its current water amount is less then 10
//       - when watering it the tree can only absorb the 40% of the water
//       - eg. watering with 10 the tree's amount of water should only increase with 4

public class Tree extends Plants {
    double waterLoss = 0.4;
    int threshold = 10;

    public Tree(String color) {
        this.color = color;
    }

    public void needsWater() {
        if (currentWaterAmount <= threshold) {
            System.out.println("The " + color + " Tree needs water");
        } else System.out.println("The " + color + " Tree doesn't needs water");
    }

    public void watering() {
        currentWaterAmount = waterDivided() * waterLoss;
    }
}
