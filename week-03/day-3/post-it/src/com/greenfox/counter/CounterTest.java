package com.greenfox.counter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {
//- Check if everything is working fine with the proper test
//  - Download [`CounterTest.java`] and place it next to your solution
//  - If you are unsure on how to get this running, you can [watch a video tutorial]
//  - Other hints for running:
//      - If something's red in it, ALT+Enter Add JUnit5 to classpath (**5 aka JUnit FIVE not 4 or 3**)
//      - Then run the tests with the green play button before the lines (run all of them before the classname)


    Counter c = new Counter();

    @Test
    void addMore() {
        c.add(5);
        assertEquals(5, c.get());
    }

    @Test
    void addOne() {
        c.add();
        assertEquals(1, c.get());
    }

    @Test
    void getZero() {
        assertEquals(0, c.get());
    }

    @Test
    void getInit() {
        Counter c = new Counter(7);
        assertEquals(7, c.get());
    }

    @Test
    void resetToZero() {
        c.add();
        c.reset();
        assertEquals(0, c.get());
    }

    @Test
    void resetToInit() {
        Counter c = new Counter(7);
        c.add(5);
        c.reset();
        assertEquals(7, c.get());
    }
}