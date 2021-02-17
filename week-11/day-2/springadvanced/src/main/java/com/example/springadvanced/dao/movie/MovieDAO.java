package com.example.springadvanced.dao.movie;

import com.example.springadvanced.dao.RetrofitClientInstance;
import com.example.springadvanced.dto.movie.RootPopular;
import com.example.springadvanced.dto.movie.RootReview;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

@Repository
public class MovieDAO {
    public RootReview fetchReviewOfMovie(String apiKey, int movieId) throws IOException {
        Retrofit retrofitInstance = RetrofitClientInstance.getRetrofitInstance();

        MovieRetrofitDAO movieRetrofitDAO = retrofitInstance.create(MovieRetrofitDAO.class);
        Call<RootReview> allReviewsOfMovie = movieRetrofitDAO.getReviewOfMovie(movieId, apiKey);
        Response<RootReview> execute = allReviewsOfMovie.execute();

        return execute.body();
    }

    public RootPopular fetchPopularFilms(String apiKey) throws IOException {
        Retrofit retrofitInstance = RetrofitClientInstance.getRetrofitInstance();

        MovieRetrofitDAO movieRetrofitDAO = retrofitInstance.create(MovieRetrofitDAO.class);
        Call<RootPopular> allPopularMovies = movieRetrofitDAO.getPopularMovies(apiKey);
        Response<RootPopular> execute = allPopularMovies.execute();

        return execute.body();
    }
}