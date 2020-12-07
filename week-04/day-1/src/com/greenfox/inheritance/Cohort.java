package com.greenfox.inheritance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cohort {
    String name;
    List<Student> students;
    List<Mentor> mentors;

    public void addStudent(Student name) {
        students.add(name);
    }

    public void addMentor(Mentor name) {
        mentors.add(name);
    }

    public void info() {
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors");
    }

    public Cohort(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }
}
