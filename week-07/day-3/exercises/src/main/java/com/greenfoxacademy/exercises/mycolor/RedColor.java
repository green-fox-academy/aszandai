package com.greenfoxacademy.exercises.mycolor;

import com.greenfoxacademy.exercises.hellodi.Printer;
import org.springframework.stereotype.Service;

public class RedColor implements MyColor {
//    public void printColor() {
//        System.out.println("It is red color...");
//    }

    @Override
    public void printColor(Printer printer) {
        printer.log("red");
    }
}
