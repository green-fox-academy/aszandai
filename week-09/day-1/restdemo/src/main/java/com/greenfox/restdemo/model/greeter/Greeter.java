package com.greenfox.restdemo.model.greeter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Greeter {
    private String welcome_message;

    public Greeter(String name, String title) {
        this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
    }
}
