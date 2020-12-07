package com.greenfox.inheritance;

public class Mentor extends Person{
    String level;

    public void introduce() {
        System.out.println(commonIntroduce() + " " + level + " mentor.");
    }

    public void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }

    public Mentor(String name, int age, String gender, String level) {
        this.level = level;
    }

    public Mentor() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        level = "intermediate";
    }
}
