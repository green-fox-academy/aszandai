package com.resttest.controller;

import com.resttest.model.groot.Groot;
import com.resttest.model.groot.GrootError;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {
    @GetMapping("/groot")
    public ResponseEntity<?> grootMessage(@RequestParam(required = false) String message) {
        if(message == null) {
            return ResponseEntity.badRequest().body(new GrootError());
        }
        return ResponseEntity.ok(new Groot(message));
    }
}
