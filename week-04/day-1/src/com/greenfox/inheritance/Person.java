package com.greenfox.inheritance;

public class Person {
    String name;
    int age;
    String gender;

    public String commonIntroduce() {
        return "HI, I'm " + name + ", a " + age + " year old " + gender;
    }
    public void introduce() {
        System.out.println(commonIntroduce() + ".");
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
    }
}
