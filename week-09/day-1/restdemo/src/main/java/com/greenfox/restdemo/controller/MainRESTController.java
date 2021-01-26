package com.greenfox.restdemo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfox.restdemo.model.arrayhandler.Array;
import com.greenfox.restdemo.model.arrayhandler.ArrayDTO;
import com.greenfox.restdemo.model.doubling.Doubling;
import com.greenfox.restdemo.model.dountil.DoUntil;
import com.greenfox.restdemo.model.log.Log;
import com.greenfox.restdemo.model.log.LogSum;
import com.greenfox.restdemo.repository.LogRepository;
import com.greenfox.restdemo.service.appenda.AppendService;
import com.greenfox.restdemo.service.arrayhandler.ArrayService;
import com.greenfox.restdemo.service.doubling.DoublingService;
import com.greenfox.restdemo.service.dountil.DoUntilService;
import com.greenfox.restdemo.service.greeter.GreeterService;
import com.greenfox.restdemo.service.log.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainRESTController {
    DoublingService doublingService;
    GreeterService greeterService;
    AppendService appendService;
    DoUntilService doUntilService;
    ArrayService arrayService;
    LogRepository logRepository;
    LogService logService;
    ObjectMapper objectMapper;

    @Autowired
    public MainRESTController(DoublingService doublingService,
                              GreeterService greeterService,
                              AppendService appendService,
                              DoUntilService doUntilService,
                              ArrayService arrayService,
                              LogRepository logRepository,
                              LogService logService) {
        this.doublingService = doublingService;
        this.greeterService = greeterService;
        this.appendService = appendService;
        this.doUntilService = doUntilService;
        this.arrayService = arrayService;
        this.logRepository = logRepository;
        this.logService = logService;
    }

    @GetMapping("/doubling")
    public ResponseEntity<?> getDoubleOfInput(@RequestParam(required = false) Integer input) throws JsonProcessingException {
        objectMapper = new ObjectMapper();
        logService.addToLog("doubling", "input=" + objectMapper.writeValueAsString(input));
        return doublingService.getDoubleInput(input);
    }

    @GetMapping("/greeter")
    public ResponseEntity<?> getGreeting(@RequestParam(required = false) String name,
                                         @RequestParam(required = false) String title) throws JsonProcessingException {
        objectMapper = new ObjectMapper();
        logService.addToLog("greeter", "name=" + objectMapper.writeValueAsString(name) +
                " title=" + objectMapper.writeValueAsString(title));
        return greeterService.getGreeting(name, title);
    }

    @GetMapping("/appenda/{word}")
    public ResponseEntity<?> getAppendA(@PathVariable String word) throws JsonProcessingException {
        objectMapper = new ObjectMapper();
        logService.addToLog("appenda", "word=" + objectMapper.writeValueAsString(word));
        return appendService.appendA(word);
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity<?> postValueOfAction(@PathVariable String action,
                                               @RequestBody DoUntil doUntil) throws JsonProcessingException {
        objectMapper = new ObjectMapper();
        logService.addToLog("dountil", "action=" + objectMapper.writeValueAsString(action) +
                " until=" + objectMapper.writeValueAsString(doUntil.getUntil()) + " result=" +
                objectMapper.writeValueAsString(doUntil.getResult()));
        return doUntilService.getSelectedMethod(action, doUntil);
    }

    @PostMapping("/arrays/{what}")
    public ResponseEntity<?> postValueOfArray(@PathVariable String what,
                                              @RequestBody Array array) throws JsonProcessingException {
//        objectMapper = new ObjectMapper();
//        logService.addToLog("arrays", objectMapper.writeValueAsString(array.getWhat()) + " " +
//                objectMapper.writeValueAsString(array.getResult()) + " " +
//                objectMapper.writeValueAsString(array.getNumbers()));
        return arrayService.getSelectedMethod(what, array);
    }

    @GetMapping("/log")
    public LogSum getLogs() {
        List<Log> entries = (List<Log>) logRepository.findAll();
        return new LogSum(entries,entries.size());
    }
}
