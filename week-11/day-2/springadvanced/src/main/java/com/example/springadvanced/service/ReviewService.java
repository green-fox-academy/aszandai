package com.example.springadvanced.service;

import com.example.springadvanced.dao.review.ReviewDAO;
import com.example.springadvanced.dto.review.RootReview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ReviewService {
    @Autowired
    private ReviewDAO reviewDAO;

    public RootReview fetchReviewOfMovie(String apiKey, int movieId) throws IOException {
        return reviewDAO.fetchReviewOfMovie(apiKey, movieId);
    }
}
