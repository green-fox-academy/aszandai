package com.example.springadvanced.dao.movie;

import com.example.springadvanced.dto.movie.RootPopular;
import com.example.springadvanced.dto.movie.RootReview;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MovieRetrofitDAO {
    @GET("/3/movie/{movie_id}/reviews")
    Call<RootReview> getReviewOfMovie(
            @Path("movie_id") int movieId,
            @Query("api_key") String apiKey);

    @GET("/3/movie/popular")
    Call<RootPopular> getPopularMovies(@Query("api_key") String apiKey);
}
