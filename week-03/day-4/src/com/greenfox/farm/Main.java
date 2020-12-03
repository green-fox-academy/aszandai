package com.greenfox.farm;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("cat");
        Animal dog = new Animal("dog");
        Animal pig = new Animal("pig");
        Animal cow = new Animal("cow");

        Farm animal = new Farm();
        animal.farm.add(cat);
        animal.farm.add(dog);
        animal.farm.add(pig);
        animal.farm.add(cow);

        pig.play();
        pig.eat();
        dog.drink();

        System.out.println("Places left to fill : " + animal.leftoverSpace);
        System.out.println(animal.farm);

        animal.breed("llama");
        System.out.println(animal.farm);
        animal.slaughter();
        System.out.println(animal.farm);
    }
}
