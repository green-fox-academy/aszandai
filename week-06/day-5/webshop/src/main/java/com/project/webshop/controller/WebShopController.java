package com.project.webshop.controller;

import com.project.webshop.model.ShopItems;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;
import java.util.stream.Collectors;

@Controller
public class WebShopController {

    List<ShopItems> shopItemsList = new ArrayList<>();

    public WebShopController() {
        shopItemsList.add(new ShopItems(
                "Running Shoes",
                "Nike running shoes for everyday sport",
                25000.0,
                8));
        shopItemsList.add(new ShopItems(
                "Nike Printer",
                "Some HP printer that will print pages",
                65000.0,
                42));
        shopItemsList.add(new ShopItems(
                "Coca Cola",
                "Standard 0.5L Coca Cola",
                250.0,
                0));
        shopItemsList.add(new ShopItems(
                "T-Shirt",
                "Blue with a corgi on a bike",
                3000.0,
                12));
        shopItemsList.add(new ShopItems(
                "Flux Capacitor",
                "Eats Uranium and can help in time travel",
                2500000.0,
                0));
    }

    @GetMapping("/webshop")
    public String indexPage(Model model) {
        model.addAttribute("itemsList", shopItemsList);

        return "index";
    }

    private List<ShopItems> getItemAboveZeroQuantity() {
        return shopItemsList.stream()
                .filter(i -> i.getQuantityOfStock() > 0)
                .collect(Collectors.toList());
    }

    @GetMapping("/only-available")
    public String onlyAvailable(Model model) {
        model.addAttribute("itemsList", getItemAboveZeroQuantity());
        return "index";
    }

    private List<ShopItems> getCheapestFirst() {
        return shopItemsList.stream()
                .sorted(Comparator.comparing(ShopItems::getPrice))
                .collect(Collectors.toList());
    }

    @GetMapping("/cheapest-first")
    public String cheapestFirst(Model model) {
        model.addAttribute("itemsList", getCheapestFirst());
        return "index";
    }

    private List<ShopItems> getContainsNike() {
        return shopItemsList.stream()
                .filter(i -> i.getDescription().contains("Nike") || i.getName().contains("Nike"))
                .collect(Collectors.toList());
    }

    @GetMapping("/contains-nike")
    public String containsNike(Model model) {
        model.addAttribute("itemsList", getContainsNike());
        return "index";
    }

    private Double getAverageStock() {
        return shopItemsList.stream()
                .mapToDouble(ShopItems::getQuantityOfStock)
                .average().getAsDouble();
    }

    @GetMapping("/average-stock")
    public String averageStock(Model model) {
        if (!shopItemsList.isEmpty()) {
            model.addAttribute("averageStock", getAverageStock());
        }
        return "indexSimple";
    }

    private Optional<ShopItems> getMostExpensive() {
        return shopItemsList.stream().min((i1, i2) -> i2.getPrice().compareTo(i1.getPrice()));
    }

    @GetMapping("/most-expensive")
    public String mostExpensive(Model model) {
        Optional<ShopItems> optionalShopItems = getMostExpensive();
        if (optionalShopItems.isPresent()) {
            ShopItems shopItems = optionalShopItems.get();
            model.addAttribute("mostExpensive", shopItems.getName());
        }
        return "indexSimple";
    }
}
