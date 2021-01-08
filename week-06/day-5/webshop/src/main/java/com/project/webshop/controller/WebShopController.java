package com.project.webshop.controller;

import com.project.webshop.model.ShopItems;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class WebShopController {

    List<ShopItems> shopItemsList = new ArrayList<>();

    public WebShopController() {
        shopItemsList.add(new ShopItems(
                "Running Shoes",
                "Nike running shoes for everyday sport",
                25000.0,
                5));
        shopItemsList.add(new ShopItems(
                "Printer",
                "Some HP printer that will print pages",
                65000.0,
                2));
        shopItemsList.add(new ShopItems(
                "Coca Cola",
                "Standard 0.5L Coca Cola",
                250.0,
                0));
        shopItemsList.add(new ShopItems(
                "T-Shirt",
                "Blue with a corgi on a bike",
                3000.0,
                1));
    }

    @GetMapping("/webshop")
    public String indexPage(Model model) {
        model.addAttribute("itemsList", shopItemsList);

        return "index";
    }

    @GetMapping("/only-available")
    public String onlyAvailable(Model model) {
        model.addAttribute("itemsList", getItemAboveZeroQuantity());

        return "index";
    }


    private List<ShopItems> getItemAboveZeroQuantity() {
        return shopItemsList.stream()
                .filter(i -> i.getQuantityOfStock() > 0)
                .collect(Collectors.toList());
    }
}
