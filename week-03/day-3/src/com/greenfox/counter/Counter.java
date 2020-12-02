package com.greenfox.counter;

public class Counter {
//  - Create `com.greenfox.counter.Counter` class
//  - which has an integer field value
//  - when creating it should have a default value 0 or we can specify it when
//    creating
//  - we can `add(number)` to this counter another whole number
//  - or we can `add()` without parameters just increasing the counter's value by one
//  - and we can `get()` the current value
//  - also we can `reset()` the value to the initial value

    int defaultValue = 0;
    int counter = 0;

    public Counter(int number) {
        this.counter = number;
        this.defaultValue = number;
    }

    public Counter() {
    }

    public void add(int number) {
        counter += number;
    }

    public void add() {
        counter++;
    }

    public int get() {
        return counter;
    }

    public void reset() {
        this.counter = this.defaultValue;
    }

    public static void main(String[] args) {

    }

}
