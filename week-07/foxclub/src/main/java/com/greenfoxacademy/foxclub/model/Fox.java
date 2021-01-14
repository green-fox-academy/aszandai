package com.greenfoxacademy.foxclub.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Fox {
    private String name;
    private List<String> trickList = new ArrayList<>();
    private List<String> foodList = new ArrayList<>();
    private List<String> drinkList = new ArrayList<>();

    public Fox() {
    }

    public Fox(String name, List<String> trickList, List<String> foodList, List<String> drinkList) {
        this.name = name;
        this.trickList = trickList;
        this.foodList = foodList;
        this.drinkList = drinkList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTrickList() {
        return trickList;
    }

    public void setTrickList(List<String> trickList) {
        this.trickList = trickList;
    }

    public List<String> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<String> foodList) {
        this.foodList = foodList;
    }

    public List<String> getDrinkList() {
        return drinkList;
    }

    public void setDrinkList(List<String> drinkList) {
        this.drinkList = drinkList;
    }
}
