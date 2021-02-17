package com.example.springadvanced.controller;

import com.example.springadvanced.dto.Countries;
import com.example.springadvanced.dto.guestauth.RequestNewToken;
import com.example.springadvanced.dto.genre.Root;
import com.example.springadvanced.dto.movie.RootPopular;
import com.example.springadvanced.dto.movie.RootReview;
import com.example.springadvanced.service.GuestAuthenticationService;
import com.example.springadvanced.service.CountriesService;
import com.example.springadvanced.service.GenreService;
import com.example.springadvanced.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Controller
public class MainController {

    private final CountriesService countriesService;
    private final GenreService genreService;
    private final ReviewService reviewService;
    private final GuestAuthenticationService guestAuthenticationService;

    @Autowired
    public MainController(CountriesService countriesService, GenreService genreService,
                          ReviewService reviewService, GuestAuthenticationService guestAuthenticationService) {
        this.countriesService = countriesService;
        this.genreService = genreService;
        this.reviewService = reviewService;
        this.guestAuthenticationService = guestAuthenticationService;
    }

    @GetMapping("/countries")
    public ResponseEntity<?> getCountries(@RequestParam(value = "api_key") String apiKey) {
        try {
            List<Countries> countries = countriesService.fetchCountries(apiKey);
            return new ResponseEntity<>(countries, HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/list")
    public ResponseEntity<?> getGenres(@RequestParam(value = "api_key") String apiKey) {
        try {
            Root root = genreService.fetchGenres(apiKey);
            return new ResponseEntity<>(root, HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/popular")
    public ResponseEntity<?> getPopularMovies(@RequestParam(value = "api_key") String apiKey) {
        try {
            RootPopular rootPopular = reviewService.fetchPopularMovies(apiKey);
            return new ResponseEntity<>(rootPopular, HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/movie/{movie_id}/reviews")
    public ResponseEntity<?> getReviewOfMovie(@RequestParam(value = "api_key") String apiKey,
                                           @PathVariable(value = "movie_id") int movieId) {
        try {
            RootReview rootReview = reviewService.fetchReviewOfMovie(apiKey, movieId);
            return new ResponseEntity<>(rootReview, HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/new")
    public ResponseEntity<?> getNewRequestToken(@RequestParam(value = "api_key") String apiKey) {
        try {
            RequestNewToken requestNewToken = guestAuthenticationService.fetchNewToken(apiKey);
            return new ResponseEntity<>(requestNewToken, HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
