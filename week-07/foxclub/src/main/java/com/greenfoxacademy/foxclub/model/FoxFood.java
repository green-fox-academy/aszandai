package com.greenfoxacademy.foxclub.model;

import java.util.ArrayList;
import java.util.List;

public class FoxFood {
    private List<String> foxFoods;

    public FoxFood() {
        foxFoods = new ArrayList<>();
        foxFoods.add("Mayo");
        foxFoods.add("Hamburger");
        foxFoods.add("Pizza");
    }

    public FoxFood(List<String> foxFoods) {
        this.foxFoods = foxFoods;
    }

    public List<String> getFoxFoods() {
        return foxFoods;
    }

    public void setFoxFoods(List<String> foxFoods) {
        this.foxFoods = foxFoods;
    }
}
