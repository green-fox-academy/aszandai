package com.example.springadvanced.dao;

import com.example.springadvanced.model.Root;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GenreRetrofitDAO {
    @GET("/3/genre/movie/list")
    Call<Root> getRoot(@Query("api_key") String apiKey);
}
