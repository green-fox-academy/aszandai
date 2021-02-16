package com.example.springadvanced.dao.popular;

import com.example.springadvanced.dto.popular.RootPopular;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PopularRetrofitDAO {
    @GET("/3/movie/popular")
    Call<RootPopular> getPopularMovies(@Query("api_key") String apiKey);
}
