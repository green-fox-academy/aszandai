package com.greenfoxacademy.foxclub.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class Fox {
    private String name;
    private String foxFoods;
    private String foxDrinks;
    private String foxTricks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoxFoods() {
        return foxFoods;
    }

    public void setFoxFoods(String foxFoods) {
        this.foxFoods = foxFoods;
    }

    public String getFoxDrinks() {
        return foxDrinks;
    }

    public void setFoxDrinks(String foxDrinks) {
        this.foxDrinks = foxDrinks;
    }

    public String getFoxTricks() {
        return foxTricks;
    }

    public void setFoxTricks(String foxTricks) {
        this.foxTricks = foxTricks;
    }
}
