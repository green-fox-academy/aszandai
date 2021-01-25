package com.greenfox.restdemo.service.appenda;

import com.greenfox.restdemo.model.appenda.Append;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AppendService {
    public ResponseEntity<?> appendA(String word){
        if (word == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(new Append(word));
    }
}
