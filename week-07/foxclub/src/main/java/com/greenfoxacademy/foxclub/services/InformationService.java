package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.model.Drink;
import com.greenfoxacademy.foxclub.model.Food;
import com.greenfoxacademy.foxclub.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InformationService {

    @Autowired
    LoginService loginService;

    public List<String> getFoodList() {
        return Arrays.stream(Food.values())
                .map(Enum::toString)
                .collect(Collectors.toList());
    }

    public List<String> getDrinkList() {
        return Arrays.stream(Drink.values())
                .map(Enum::toString)
                .collect(Collectors.toList());
    }

//    public void addDrink(String drink) {
//        loginService.getCurrentFox().setDrink(Drink.valueOf(drink));
//    }
//
//    public void addFood(String food) {
//        loginService.getCurrentFox().setFood(Food.valueOf(food));
//    }
}
