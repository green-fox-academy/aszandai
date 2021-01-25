package com.greenfox.restdemo.model.appenda;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Append {
    private String appended;

    public Append(String word) {
        this.appended = word + "a";
    }
}
