package com.greenfox.cheapreddit.controller;

import com.greenfox.cheapreddit.model.User;
import com.greenfox.cheapreddit.service.UserService;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/registration")
    public String userRegistrationPage() {
        return "registrationpage";
    }

    @PostMapping("/registration")
    public String userRegistrationSubmit(@ModelAttribute User user) {
        userService.addUser(user);
        return "redirect:/";
    }

    @GetMapping("/login")
    public String userLoginPage() {
        return "loginpage";
    }

    @PostMapping("/login")
    public String userLoginSubmit(String name) {
        userService.userLogin(name);
        return "redirect:/";
    }
}
