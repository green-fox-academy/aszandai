package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class MisterInternationalController {

    @RequestMapping("/webApp")
    public String greetingInternational(Model model, @RequestParam String name) {
        Random random = new Random();
        int textSize = (int) (Math.random() * 100);
        int randomColor = random.nextInt(0xffffff + 1);
        String colorCode = String.format("#%06x", randomColor);

        model.addAttribute("name", name);
        model.addAttribute("greetings", getRandomGreet());
        model.addAttribute("randomSize", textSize);
        model.addAttribute("randomColor", colorCode);

        return "greetingColored";
    }

    private String getRandomGreet() {
        String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
                "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
                "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
                "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
        Random random = new Random();
        int randomGreet = random.nextInt(hellos.length);

        return hellos[randomGreet];
    }

}
