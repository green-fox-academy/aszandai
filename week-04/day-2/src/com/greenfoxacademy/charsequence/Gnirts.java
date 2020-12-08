package com.greenfoxacademy.charsequence;

public class Gnirts implements CharSequence {
    String something;

    public Gnirts(String something) {
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
        return something;
    }

    public static void main(String[] args) {
        Gnirts gnirts = new Gnirts("elpmaxe");

        System.out.println(reverseString(gnirts));

        System.out.println(gnirts.charAt(1));
        // should print out: l

        ShiftedCharSequence shifter = new ShiftedCharSequence("example", 2);
        System.out.println(shifter.charAt(0));
        // should print out: a

    }

    private static String reverseString(Gnirts gnirts) {
        StringBuilder sb = new StringBuilder(gnirts);
        sb.reverse();
        return sb.toString();
    }
}
