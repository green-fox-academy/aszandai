package com.greenfox.restdemo.service.greeter;

import com.greenfox.restdemo.model.greeter.Greeter;
import com.greenfox.restdemo.model.greeter.GreeterErrorName;
import com.greenfox.restdemo.model.greeter.GreeterErrorNameAndTitle;
import com.greenfox.restdemo.model.greeter.GreeterErrorTitle;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class GreeterService {
    public ResponseEntity<?> getGreeting(String name, String title) {
        if (name == null || title == null) {
            if (name == null && title == null) {
                return ResponseEntity.badRequest().body(new GreeterErrorNameAndTitle());
            }
            if (name == null) {
                return ResponseEntity.badRequest().body(new GreeterErrorName());
            }
            return ResponseEntity.badRequest().body(new GreeterErrorTitle());
        }
        return ResponseEntity.ok(new Greeter(name, title));
    }
}
