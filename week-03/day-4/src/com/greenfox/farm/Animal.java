package com.greenfox.farm;

public class Animal {
    String species;
    int hunger = 50;
    int thirst = 50;

    public Animal(String species) {
        this.species = species;
    }

    public void eat() {
        System.out.println("The " + species + " is eating. Hunger changed to: " + hunger--);
    }

    public void drink() {
        System.out.println("The " + species + " is drinking. Thirst changed to: " + thirst--);
    }

    public void play() {
        System.out.println("The " + species + " is playing. Hunger changed to: " + hunger++ + ", thirst changed to: " + thirst++);
    }
}

