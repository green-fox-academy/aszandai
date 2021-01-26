package com.greenfox.restdemo.controller;

import com.greenfox.restdemo.model.arrayhandler.Array;
import com.greenfox.restdemo.model.dountil.DoUntil;
import com.greenfox.restdemo.service.appenda.AppendService;
import com.greenfox.restdemo.service.arrayhandler.ArrayService;
import com.greenfox.restdemo.service.doubling.DoublingService;
import com.greenfox.restdemo.service.dountil.DoUntilService;
import com.greenfox.restdemo.service.greeter.GreeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRESTController {
    private DoublingService doublingService;
    private GreeterService greeterService;
    private AppendService appendService;
    private DoUntilService doUntilService;
    private ArrayService arrayService;

    @Autowired
    public MainRESTController(DoublingService doublingService,
                              GreeterService greeterService,
                              AppendService appendService,
                              DoUntilService doUntilService,
                              ArrayService arrayService) {
        this.doublingService = doublingService;
        this.greeterService = greeterService;
        this.appendService = appendService;
        this.doUntilService = doUntilService;
        this.arrayService = arrayService;
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

    @PostMapping("/dountil/{action}")
    public ResponseEntity<?> postValueOfAction(@PathVariable String action, @RequestBody DoUntil doUntil) {
        if (action.equals("sum")) {
            return doUntilService.getSum(doUntil.getUntil());
        }
        if (action.equals("factor")) {
            return doUntilService.getFactor(doUntil.getUntil());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/arrays/{what}")
    public ResponseEntity<?> postValueOfArray(@PathVariable String what, @RequestBody Array array) {
        return arrayService.getSelectedMethod(what, array);
    }

}
