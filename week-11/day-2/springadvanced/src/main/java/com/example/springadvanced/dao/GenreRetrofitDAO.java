package com.example.springadvanced.dao;

import com.example.springadvanced.dto.Genre;
import com.example.springadvanced.dto.Root;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface GenreRetrofitDAO {
    @GET("/3/genre/movie/list")
    Call<List<Genre>> getGenres(@Query("api_key") String apiKey);
}
