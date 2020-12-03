package com.greenfox.farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
//- Reuse your `Animal` class
//- Create a `Farm` class
//  - it has list of Animals
//  - it has slots which defines the number of free places for animals
//  - breed() -> creates a new animal if there's place for it
//  - slaughter() -> removes the least hungry animal

    int leftoverSpace = 4;
    List<Animal> farm = new ArrayList<>();

    public void breed(String name) {
        if (leftoverSpace > 0) {
            farm.add(new Animal("llama"));
            leftoverSpace--;
            System.out.println("A new animal is born! Spaces left: " + leftoverSpace);
        } else System.out.println("The farm is full...");
    }

    public void slaughter() {
        int max = Integer.MIN_VALUE;
        int toBeSlaughtered = 0;
        for (int i = 0; i < farm.size(); i++) {
            if (max < farm.get(i).hunger) {
                max = farm.get(i).hunger;
                toBeSlaughtered = i;
            }
        }
        farm.remove(toBeSlaughtered);
    }
}
