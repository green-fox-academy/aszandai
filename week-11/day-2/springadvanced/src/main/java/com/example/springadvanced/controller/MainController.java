package com.example.springadvanced.controller;

import com.example.springadvanced.dto.Countries;
import com.example.springadvanced.dto.Genre;
import com.example.springadvanced.dto.Root;
import com.example.springadvanced.service.CountriesService;
import com.example.springadvanced.service.GenreService;
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

    private CountriesService countriesService;
    private GenreService genreService;

    @Autowired
    public MainController(CountriesService countriesService, GenreService genreService) {
        this.countriesService = countriesService;
        this.genreService = genreService;
    }

    @GetMapping("/countries")
    public ResponseEntity getCountries(@RequestParam(value = "api_key") String apiKey) {
        try {
            List<Countries> countries = countriesService.fetchCountries(apiKey);
            return new ResponseEntity(countries, HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/list")
    public ResponseEntity getGenres(@RequestParam(value = "api_key") String apiKey) {
        try {
            Root root = genreService.fetchGenres(apiKey);
            return new ResponseEntity(root, HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
