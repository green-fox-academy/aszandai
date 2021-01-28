package com.resttest.model.yondu;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Yondu {
    private double distance;
    private double time;
    private double speed;

    public Yondu(double distance, double time) {
        this.distance = distance;
        this.time = time;
        this.speed = distance / time;
    }
}