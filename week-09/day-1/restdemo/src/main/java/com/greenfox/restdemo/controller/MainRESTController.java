package com.greenfox.restdemo.controller;

import com.greenfox.restdemo.service.DoublingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRESTController {
    private DoublingService doublingService;

    @Autowired
    public MainRESTController(DoublingService doublingService) {
        this.doublingService = doublingService;
    }

    @GetMapping("/doubling")
    public ResponseEntity<?> getDoubleOfInput(@RequestParam(required = false) Integer input) {
        return doublingService.getDoubleInput(input);
    }

}
