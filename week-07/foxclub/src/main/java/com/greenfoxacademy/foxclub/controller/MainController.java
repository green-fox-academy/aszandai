package com.greenfoxacademy.foxclub.controller;

import com.greenfoxacademy.foxclub.model.Fox;
import com.greenfoxacademy.foxclub.model.FoxDrink;
import com.greenfoxacademy.foxclub.model.FoxFood;
import com.greenfoxacademy.foxclub.model.FoxTrick;
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

    @Autowired
    public MainController(LoginService loginService, InformationService informationService) {
        this.loginService = loginService;
        this.informationService = informationService;
    }

    @GetMapping("/")
    public String homePage(@RequestParam(defaultValue = "Mr. Fox") String name, @ModelAttribute Fox fox, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/login")
    public String getLoginPage(Model model, FoxFood food, FoxDrink drink, FoxTrick trick) {
        model.addAttribute("foodsList", informationService.getFoodsList(food));
        model.addAttribute("drinksList", informationService.getDrinksList(drink));

        model.addAttribute("counter");
        return "login";
    }

    @PostMapping("/login")
    public String addCharacter(@ModelAttribute Fox fox, Model model, FoxFood food, FoxDrink drink) {
        loginService.nameTheFox(fox);
        loginService.addFox(fox);

        return "redirect:/?name=" + fox.getName();
    }
}
