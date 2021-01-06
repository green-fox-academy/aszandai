package com.greenfoxacademy.springstart.controllers;

public class Greeting {
    Long greetCount;
    String content;

    public Greeting(Long greetCount, String content) {
        this.greetCount = greetCount;
        this.content = content;
    }

    public Long getGreetCount() {
        return greetCount;
    }

    public String getContent() {
        return content;
    }
}
