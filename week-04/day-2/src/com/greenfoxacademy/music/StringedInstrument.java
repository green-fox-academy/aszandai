package com.greenfoxacademy.music;

public class StringedInstrument extends Instrument {
    Integer numberOfStrings;
    String sound;

    public StringedInstrument(Integer numberOfStrings, String sound,String name) {
        this.numberOfStrings = numberOfStrings;
        this.sound = sound;
        this.name = name;
    }

    public StringedInstrument() {

    }

    void sound() {
        this.sound = sound;
    }

    @Override
    void play() {
        System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound);
    }
}
