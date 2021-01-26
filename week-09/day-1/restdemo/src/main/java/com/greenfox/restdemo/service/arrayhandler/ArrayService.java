package com.greenfox.restdemo.service.arrayhandler;

import com.greenfox.restdemo.model.arrayhandler.Array;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Arrays;

@Service
public class ArrayService {
    Array array = new Array();

    public ResponseEntity<?> getSumOfValues(int[] numbers) {
        array.setWhat("sum");
        array.setResult(Arrays.stream(numbers).sum());
        return ResponseEntity.ok(array);
    }
    public ResponseEntity<?> getMultiplyOfValues(int[] numbers) {
        array.setWhat("multiply");
        for (int i = 0; i < numbers.length; i++) {
            array.setResult(numbers[i] = numbers[i] * numbers[i]);
        }
        return ResponseEntity.ok(array);
    }
    public ResponseEntity<?> getDoubleOfValues(int[] numbers) {
        array.setWhat("double");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
            array.setNumbers(numbers);
        }
        return ResponseEntity.ok(array);
    }

    public ResponseEntity<?> getSelectedMethod(String what, Array array) {
        if (what.equals("sum")) {
            return getSumOfValues(array.getNumbers());
        }
        if (what.equals("double")) {
            return getDoubleOfValues(array.getNumbers());
        }
        if (what.equals("multiply")) {
            return getMultiplyOfValues(array.getNumbers());
        }
        return ResponseEntity.notFound().build();
    }
}
