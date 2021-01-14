package com.greenfoxacademy.foxclub.controller;

import com.greenfoxacademy.foxclub.model.Fox;
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

    @Autowired
    public MainController(LoginService loginService) {
        this.loginService = loginService;

    }

    @GetMapping("")
    public String homePage(Model model, @RequestParam(defaultValue = "Mr. Fox") String name) {
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/login")
    public String getLoginPage(Model model) {
        return "login";
    }

    @PostMapping("/login")
    public String addCharacter(@ModelAttribute Fox fox) {
        loginService.addFox(fox);
        return "redirect:/?name=" + fox.getName();
    }
}
