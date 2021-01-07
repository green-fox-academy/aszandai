package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BankController {

    @GetMapping("/show")
    public String bankSite(Model model, String name, Integer balance, String animalType) {

        BankAccount account = new BankAccount("Simba", 2000, "lion");
        String currency = "Zebra";

        model.addAttribute("name", account.getName());
        model.addAttribute("balance", account.getBalance());
        model.addAttribute("type", account.getAnimalType());
        model.addAttribute("currency", currency);
        return "index";
    }

    @GetMapping("/message")
    public String anotherEndpoint(Model model) {
        String message = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("message", message);

        return "message";
    }
}
