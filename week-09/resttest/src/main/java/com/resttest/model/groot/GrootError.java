package com.resttest.model.groot;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GrootError {
    private String error;

    public GrootError() {
        this.error = "I am Groot...";
    }
}
