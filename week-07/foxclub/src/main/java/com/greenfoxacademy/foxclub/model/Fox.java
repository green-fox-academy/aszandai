package com.greenfoxacademy.foxclub.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class Fox {
    private String name;
    private Food food;
    private Drink drink;
    List<Trick> tricks = new ArrayList<>();

    public Fox(String name) {
        this.name = name;
        food = Food.Kebab;
        drink = Drink.Getorade;
        tricks.add(Trick.Exist);
        tricks.add(Trick.PowerNap);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public List<Trick> getTricks() {
        return tricks;
    }

    public void setTricks(List<Trick> tricks) {
        this.tricks = tricks;
    }

    public Integer getTrickSum() {
        return tricks.size();
    }
}
