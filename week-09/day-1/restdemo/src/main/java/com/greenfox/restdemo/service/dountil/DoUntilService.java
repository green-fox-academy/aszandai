package com.greenfox.restdemo.service.dountil;

import com.greenfox.restdemo.model.dountil.DoUntil;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.stream.IntStream;

@Service
public class DoUntilService {
    DoUntil doUntil = new DoUntil();

    public ResponseEntity<?> getSum(int until) {
        doUntil.setResult(IntStream.rangeClosed(1, until).sum());
        return ResponseEntity.ok(doUntil.getResult());
    }

    public ResponseEntity<Integer> getFactor(int until) {
        doUntil.setResult(IntStream.rangeClosed(1, until).reduce(1, (int x, int y) -> x * y));
        return ResponseEntity.ok(doUntil.getResult());
    }

}
