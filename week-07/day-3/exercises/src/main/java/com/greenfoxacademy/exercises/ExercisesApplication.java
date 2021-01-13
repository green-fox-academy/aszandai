package com.greenfoxacademy.exercises;

import com.greenfoxacademy.exercises.hellodi.Printer;
import com.greenfoxacademy.exercises.mycolor.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExercisesApplication implements CommandLineRunner {
    private Printer printer;
    private MyColor myColor;

    @Autowired
    ExercisesApplication(Printer printer, MyColor myColor) {
        this.printer = printer;
        this.myColor = myColor;
    }

    public static void main(String[] args) {
        SpringApplication.run(ExercisesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("hello");
        myColor.printColor(printer);
    }
}
