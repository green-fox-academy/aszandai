package com.resttest.controller;

import com.resttest.model.yondu.Yondu;
import com.resttest.model.yondu.YonduError;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YonduController {
    @GetMapping("/yondu")
    public ResponseEntity<?> yonduArrowSpeed(@RequestParam(required = false) Double distance,
                                             @RequestParam(required = false) Double time) {
        if (distance == null || time == null) {
            return ResponseEntity.status(500).body(new YonduError());
        }
        return ResponseEntity.ok(new Yondu(distance,time));
    }
}
