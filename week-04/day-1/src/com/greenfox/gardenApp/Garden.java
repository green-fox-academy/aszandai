package com.greenfox.gardenApp;

import java.util.ArrayList;
import java.util.List;

//      The Garden
//       - is able to hold unlimited amount of flowers or trees
//       - when watering it should only water those what needs water with equally divided amount amongst them
//       - eg. watering with 40 and 4 of them need water then each gets watered with 10

public class Garden {
    String color;
    List<Garden> garden;

    double currentWaterAmount;
    double waterAmount;

    public Garden() {
        this.garden = new ArrayList<>();
    }

    public void addFlower(Flower color) {
        garden.add(color);
    }

    public void addTree(Tree color) {
        garden.add(color);
    }

    public double waterDivided() {
        return waterAmount / garden.size();
    }

    public void watering1() {
        waterAmount = 40;
        System.out.println("Watering with " + waterAmount);
    }

    public void watering2() {
        waterAmount = 70;
        System.out.println("Watering with " + waterAmount);
    }

}
