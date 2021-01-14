package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.model.FoxDrink;
import com.greenfoxacademy.foxclub.model.FoxFood;
import com.greenfoxacademy.foxclub.model.FoxTrick;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationService {
    Integer trickCounter;

    public List<String> getFoodsList(FoxFood food) {
        return food.getFoxFoods();
    }

    public List<String> getDrinksList(FoxDrink drink) {
        return drink.getFoxDrinks();
    }

    public List<String> getTricksList(FoxTrick trick) {
        return trick.getFoxTricks();
    }

}
