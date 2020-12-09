package com.greenfox.gardenApp;

abstract class Plants extends Garden {
    public abstract void needsWater();

    public abstract void watering();

    double currentWaterAmount = 0;
}
