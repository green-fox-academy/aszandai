package com.example.springadvanced.dao.review;

import com.example.springadvanced.dao.RetrofitClientInstance;
import com.example.springadvanced.dto.review.RootReview;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

@Repository
public class ReviewDAO {
    public RootReview fetchReviewOfMovie(String apiKey, int movieId) throws IOException {
        Retrofit retrofitInstance = RetrofitClientInstance.getRetrofitInstance();

        ReviewRetrofitDAO reviewRetrofitDAO = retrofitInstance.create(ReviewRetrofitDAO.class);
        Call<RootReview> allReviewsOfMovie = reviewRetrofitDAO.getReviewOfMovie(movieId, apiKey);
        Response<RootReview> execute = allReviewsOfMovie.execute();

        return execute.body();
    }
}