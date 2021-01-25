package com.greenfox.restdemo.service.doubling;

import com.greenfox.restdemo.model.doubling.Doubling;
import com.greenfox.restdemo.model.doubling.Error;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DoublingService {
    public ResponseEntity<?> getDoubleInput(Integer input) {
        if (input == null) {
            return ResponseEntity.ok(new Error());
        }
        return ResponseEntity.ok(new Doubling(input));
    }
}
