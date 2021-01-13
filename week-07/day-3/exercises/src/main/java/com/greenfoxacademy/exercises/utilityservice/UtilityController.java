package com.greenfoxacademy.exercises.utilityservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {
    private UtilityService utilityService;

    @Autowired
    UtilityController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/useful")
    public String mainPage() {

        return "index";
    }

    @GetMapping("/useful/colored")
    public String coloredPage(Model model) {
        model.addAttribute("randomColor", utilityService.randomColor());
        return "index";
    }

    @GetMapping("/useful/email")
    public String emailPage(@RequestParam String email, Model model) {
        if (utilityService.validateEmail(email)) {
            model.addAttribute("message", email + " is a valid email address.");
            model.addAttribute("color", "green");
            return "index";
        }
        model.addAttribute("message", email + " is not a valid email address.");
        model.addAttribute("color", "red");
        return "index";
    }
}
