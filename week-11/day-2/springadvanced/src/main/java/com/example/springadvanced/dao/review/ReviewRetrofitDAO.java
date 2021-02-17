package com.example.springadvanced.dao.review;

import com.example.springadvanced.dto.review.RootReview;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ReviewRetrofitDAO {
    @GET("/3/movie/{movie_id}/reviews")
    Call<RootReview> getReviewOfMovie(
            @Path("movie_id") int movieId,
            @Query("api_key") String apiKey);
}
