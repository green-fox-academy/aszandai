package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {

    @GetMapping("/show")
    public String bankSite(Model model) {

        BankAccount account = new BankAccount(
                "Simba", 2000, "lion", "Baby zebras", false, true);
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

    private List<BankAccount> accountList = new ArrayList<>();

    public BankController() {
        accountList.add(new BankAccount(
                "Simba", 2000, "Lion", "Baby zebras", true, true));
        accountList.add(new BankAccount(
                "Scar", 1520, "Big ass lion", "Zebras", false, false));
        accountList.add(new BankAccount(
                "Timon", 100, "Meerkat", "Insects", false, true));
        accountList.add(new BankAccount(
                "Pumba", 250, "Warthog", "Roots", false, true));
        accountList.add(new BankAccount(
                "Mufasa", 9999, "Former king of lions", "Zebras", false, true));
        accountList.add(new BankAccount(
                "Zazu", 420, "Hornbill", "Fruits", false, false));
    }

    @GetMapping("/animals")
    public String animalAccounts(Model model) {
        model.addAttribute("accounts", accountList);

        return "animalList";
    }
}
