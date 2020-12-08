package com.greenfoxacademy.charsequence;


public class ShiftedCharSequence implements CharSequence {
    String something;

    public ShiftedCharSequence(String something, int number) {
        this.something = something;
    }

    @Override
    public int length() {
        return something.length();
    }

    @Override
    public char charAt(int index) {
        return something.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
