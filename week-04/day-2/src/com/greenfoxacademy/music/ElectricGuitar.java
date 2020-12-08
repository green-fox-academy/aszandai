package com.greenfoxacademy.music;

public class ElectricGuitar extends StringedInstrument{

    public ElectricGuitar(int numberOfStrings) {
        super();
        name = "Electric Guitar";
        this.numberOfStrings = 6;
        sound = "Twang";
    }



    public ElectricGuitar() {
        super(6, "Twang","Electric Guitar");
    }
}
