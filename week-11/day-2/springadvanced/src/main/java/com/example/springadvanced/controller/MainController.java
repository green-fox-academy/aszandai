package com.example.springadvanced.controller;

import com.example.springadvanced.model.Countries;
import com.example.springadvanced.service.CountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private CountriesService countriesService;

    @GetMapping("/countries")
    public ResponseEntity getGenres(@RequestParam(value = "api_key") String apiKey) {
        try {
            List<Countries> countries = countriesService.fetchGenres(apiKey);
            return new ResponseEntity(countries, HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
