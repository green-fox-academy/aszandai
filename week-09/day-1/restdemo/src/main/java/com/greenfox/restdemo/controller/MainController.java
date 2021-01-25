package com.greenfox.restdemo.controller;

import com.greenfox.restdemo.model.Doubling;
import com.greenfox.restdemo.service.DoublingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    private DoublingService doublingService;
    private Doubling doubling;

    @Autowired
    public MainController(DoublingService doublingService) {
        this.doublingService = doublingService;
    }

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }
}
