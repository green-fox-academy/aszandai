package com.greenfoxacademy.exercises.mycolor;

import com.greenfoxacademy.exercises.hellodi.Printer;
import org.springframework.stereotype.Service;

public class BlueColor implements MyColor {
//    public void printColor() {
//        System.out.println("It is blue color...");
//    }

    @Override
    public void printColor(Printer printer) {
        printer.log("red");
    }
}
