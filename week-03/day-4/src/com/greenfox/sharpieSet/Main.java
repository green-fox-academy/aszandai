package com.greenfox.sharpieSet;

import org.w3c.dom.UserDataHandler;

public class Main {
    public static void main(String[] args) {
        Sharpie black = new Sharpie("black", 2, 0);
        Sharpie blue = new Sharpie("blue", 3, 50);
        Sharpie yellow = new Sharpie("yellow", 1, 20);
        Sharpie pink = new Sharpie("pink", 5, 0);
        Sharpie green = new Sharpie("green", 4, 80);

        SharpieSet sharpieSet = new SharpieSet();
        sharpieSet.addSharpie(black);
        sharpieSet.addSharpie(blue);
        sharpieSet.addSharpie(yellow);
        sharpieSet.addSharpie(pink);
        sharpieSet.addSharpie(green);

        System.out.println("Usable sharpies: " + sharpieSet.countUsable());
        System.out.println(sharpieSet.sharpieSet);
        sharpieSet.removeTrash();
        System.out.println(sharpieSet.sharpieSet);
    }
}
