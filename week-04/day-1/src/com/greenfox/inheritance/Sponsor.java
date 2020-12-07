package com.greenfox.inheritance;

public class Sponsor extends Person{
    String company;
    int hiredStudents;

    public void introduce() {
        System.out.println(commonIntroduce() + " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    public void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }

    public void hire() {
        hiredStudents = hiredStudents + 1;
    }

    public Sponsor(String name, int age, String gender, String company) {
        this.company = company;
        hiredStudents = 0;
    }

    public Sponsor() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        company = "Google";
        hiredStudents = 0;
    }
}
