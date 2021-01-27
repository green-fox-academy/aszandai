package com.resttest.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GrootError {
    String error;

    public GrootError() {
        this.error = "I am Groot...";
    }
}
