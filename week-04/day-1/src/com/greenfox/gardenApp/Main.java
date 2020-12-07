package com.greenfox.gardenApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Flower flower1 = new Flower("yellow");
        Flower flower2 = new Flower("blue");

        Tree tree1 = new Tree("purple");
        Tree tree2 = new Tree("orange");

        Garden garden = new Garden();
        garden.addFlower(flower1);
        garden.addFlower(flower2);
        garden.addTree(tree1);
        garden.addTree(tree2);

        flower1.needsWater();
        flower2.needsWater();
        tree1.needsWater();
        tree2.needsWater();

        System.out.println();

        flower1.wateringFlower();
        tree1.wateringTree();

        garden.watering1();
        flower1.needsWater();
        flower2.needsWater();
        tree1.needsWater();
        tree2.needsWater();

        System.out.println();

        garden.watering2();
        flower1.needsWater();
        flower2.needsWater();
        tree1.needsWater();
        tree2.needsWater();
    }

}
