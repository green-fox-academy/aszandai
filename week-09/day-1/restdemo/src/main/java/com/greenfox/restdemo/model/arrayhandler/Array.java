package com.greenfox.restdemo.model.arrayhandler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Array {
    private String what;
    private int result;
    private int[] numbers;
}
