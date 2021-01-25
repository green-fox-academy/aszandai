package com.greenfox.restdemo.service;

import com.greenfox.restdemo.model.Doubling;
import com.greenfox.restdemo.model.Error;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DoublingService {
    private Doubling doubling;

    public ResponseEntity<?> getDoubleInput(Integer input) {
        if (input == null) {
            return ResponseEntity.ok(new Error());
        }
        return ResponseEntity.ok(new Doubling(input));
    }
}
