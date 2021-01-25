package com.greenfox.restdemo.model.greeter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GreeterErrorNameAndTitle {
    private String error = "Please provide a name and a title!";
}
