package com.greenfox.restdemo.model.greeter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GreeterErrorName {
    private String error = "Please provide a name!";

}