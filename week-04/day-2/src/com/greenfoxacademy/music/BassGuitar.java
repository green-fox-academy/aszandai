package com.greenfoxacademy.music;

public class BassGuitar extends StringedInstrument {
    public BassGuitar(int numberOfStrings) {
        super();
        name = "Bass Guitar";
        this.numberOfStrings = 4;
        sound = "Duum-duum-duum";
    }

    public BassGuitar() {
        super(4, "Duum-duum-duum","Bass Guitar");

    }
}
