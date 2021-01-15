package com.greenfoxacademy.foxclub.controller;

import com.greenfoxacademy.foxclub.model.Fox;
import com.greenfoxacademy.foxclub.services.InformationService;
import com.greenfoxacademy.foxclub.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class FoxController {
    Fox fox;
    InformationService informationService;
    LoginService loginService;

    @Autowired
    public FoxController(LoginService loginService, InformationService informationService) {
        this.loginService = loginService;
        this.informationService = informationService;
    }

    @GetMapping("/nutrition-store")
    public String addFoodAndStuff(@RequestParam(defaultValue = "Mr. Cutie Pie") String name, Model model) {
        fox = new Fox(name);
        loginService.setCurrentName(fox);
        model.addAttribute("fox", fox);
        model.addAttribute("tricksum", fox.getTrickSum());

        model.addAttribute("foodsList", informationService.getFoodList());
        model.addAttribute("drinksList", informationService.getDrinkList());

        return "nutritionStore";
    }

    @PostMapping("/nutrition-store")
    public String submitFoodAndStuff(@RequestParam(defaultValue = "Mr. Cutie Pie") String name, Fox fox, Model model) {
        fox = new Fox(name);
        loginService.addFox(fox);
        loginService.setCurrentName(fox);
        return "redirect:/?=" + fox.getName();
    }
}
