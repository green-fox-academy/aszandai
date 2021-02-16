package com.example.springadvanced.dao.popular;

import com.example.springadvanced.dao.RetrofitClientInstance;
import com.example.springadvanced.dto.popular.RootPopular;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

@Repository
public class PopularDAO {
    public RootPopular fetchPopularFilms(String apiKey) throws IOException {
        Retrofit retrofitInstance = RetrofitClientInstance.getRetrofitInstance();

        PopularRetrofitDAO popularRetrofitDAO = retrofitInstance.create(PopularRetrofitDAO.class);
        Call<RootPopular> allPopularMovies = popularRetrofitDAO.getPopularMovies(apiKey);
        Response<RootPopular> execute = allPopularMovies.execute();

        return execute.body();
    }
}
