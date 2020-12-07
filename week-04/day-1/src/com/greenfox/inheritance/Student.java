package com.greenfox.inheritance;

public class Student extends Person {
    String previousOrganization;
    int skippedDays;

    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    public void introduce() {
        System.out.println(commonIntroduce() + ", from " + previousOrganization+ " who skipped " + skippedDays + " days from the course already.");
    }

    public void skippedDays(int numberOfDays) {
        skippedDays = numberOfDays;
    }

    public Student(String name, int age, String gender, String previousOrganization) {
        this.previousOrganization = previousOrganization;
    }

    public Student() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        previousOrganization = "The School of Life";
        skippedDays = 0;
    }
}
