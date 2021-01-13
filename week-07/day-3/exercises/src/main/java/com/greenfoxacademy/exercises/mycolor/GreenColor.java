package com.greenfoxacademy.exercises.mycolor;

import com.greenfoxacademy.exercises.hellodi.Printer;
import org.springframework.stereotype.Service;

@Service
public class GreenColor implements MyColor {
//    public void printColor() {
//        System.out.println("It is green in color...");
//    }

    @Override
    public void printColor(Printer printer) {
        printer.log("green");
    }
}
