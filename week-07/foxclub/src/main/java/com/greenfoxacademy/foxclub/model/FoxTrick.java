package com.greenfoxacademy.foxclub.model;

import java.util.ArrayList;
import java.util.List;

public class FoxTrick {

    private List<String> foxTricks;

    public FoxTrick() {
        foxTricks.add("Eat");
        foxTricks.add("Feign death");
        foxTricks.add("Power nap");
    }

    public FoxTrick(List<String> foxTricks) {
        this.foxTricks = foxTricks;
    }

    public List<String> getFoxTricks() {
        return foxTricks;
    }

    public void setFoxTricks(List<String> foxTricks) {
        this.foxTricks = foxTricks;
    }
}
