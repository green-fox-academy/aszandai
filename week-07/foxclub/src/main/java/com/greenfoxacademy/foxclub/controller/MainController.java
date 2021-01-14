package com.greenfoxacademy.foxclub.controller;

import com.greenfoxacademy.foxclub.model.Drink;
import com.greenfoxacademy.foxclub.model.Food;
import com.greenfoxacademy.foxclub.model.Fox;
import com.greenfoxacademy.foxclub.services.InformationService;
import com.greenfoxacademy.foxclub.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {
    LoginService loginService;
    InformationService informationService;
    Fox fox;

    @Autowired
    public MainController(LoginService loginService, InformationService informationService) {
        this.loginService = loginService;
        this.informationService = informationService;
    }

    @GetMapping("/")
    public String homePage(@RequestParam(defaultValue = "Mr. Fox") String name, @ModelAttribute Fox fox, Model model) {
        if (name.equals("Mr. Fox")) {
            model.addAttribute("foodsList", informationService.getFoodList());
            model.addAttribute("drinksList", informationService.getDrinkList());
            return "login";
        } else {
            fox = new Fox(name);
            model.addAttribute("fox", fox);
            model.addAttribute("tricksum", fox.getTrickSum());
            return "index";
        }
    }

    @GetMapping("/login")
    public String getLoginPage(Model model) {
        model.addAttribute("foodsList", informationService.getFoodList());
        model.addAttribute("drinksList", informationService.getDrinkList());

        return "login";
    }

    @PostMapping("/login")
    public String postCharacter(@ModelAttribute Fox fox) {
        loginService.nameTheFox(fox);
        return "redirect:/?name=" + fox.getName();
    }

    @GetMapping("/nutrition-store")
    public String addFoodAndStuff(Model model) {
        model.addAttribute("foodsList", informationService.getFoodList());
        model.addAttribute("drinksList", informationService.getDrinkList());

        return "nutritionStore";
    }

    @PostMapping("/nutrition-store")
    public String submitFoodAndStuff(Food food, Drink drink, Model model) {
        fox.setDrink(drink);
        fox.setFood(food);
        model.addAttribute("fox", fox);
        model.addAttribute("tricksum", fox.getTrickSum());
        return "redirect:/?name=" + fox.getName();
    }
}
