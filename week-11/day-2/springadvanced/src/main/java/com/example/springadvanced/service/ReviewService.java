package com.example.springadvanced.service;

import com.example.springadvanced.dao.movie.MovieDAO;
import com.example.springadvanced.dto.movie.RootPopular;
import com.example.springadvanced.dto.movie.RootReview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ReviewService {
    @Autowired
    private MovieDAO movieDAO;

    public RootReview fetchReviewOfMovie(String apiKey, int movieId) throws IOException {
        return movieDAO.fetchReviewOfMovie(apiKey, movieId);
    }

    public RootPopular fetchPopularMovies(String apiKey) throws IOException {
        return movieDAO.fetchPopularFilms(apiKey);
    }
}
