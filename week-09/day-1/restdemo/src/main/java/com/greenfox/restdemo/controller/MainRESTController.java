package com.greenfox.restdemo.controller;

import com.greenfox.restdemo.service.appenda.AppendService;
import com.greenfox.restdemo.service.doubling.DoublingService;
import com.greenfox.restdemo.service.greeter.GreeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRESTController {
    private DoublingService doublingService;
    private GreeterService greeterService;
    private AppendService appendService;

    @Autowired
    public MainRESTController(DoublingService doublingService, GreeterService greeterService, AppendService appendService) {
        this.doublingService = doublingService;
        this.greeterService = greeterService;
        this.appendService = appendService;
    }

    @GetMapping("/doubling")
    public ResponseEntity<?> getDoubleOfInput(@RequestParam(required = false) Integer input) {
        return doublingService.getDoubleInput(input);
    }

    @GetMapping("/greeter")
    public ResponseEntity<?> getGreeting(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        return greeterService.getGreeting(name, title);
    }

    @GetMapping("/appenda/{word}")
    public ResponseEntity<?> getAppendA(@PathVariable String word) {
        return appendService.appendA(word);

    }

}
