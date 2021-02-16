package com.example.springadvanced.dao;

import com.example.springadvanced.model.Countries;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

@Repository
public class CountriesDAOImpl {
    public List<Countries> fetchGenres(String apiKey) throws IOException {
        Retrofit retrofitInstance = RetrofitClientInstance.getRetrofitInstance();

        CountriesRetrofitDAO countriesRetrofitDAO = retrofitInstance.create(CountriesRetrofitDAO.class);
        Call<List<Countries>> allGenres = countriesRetrofitDAO.getGenres(apiKey);

        Response<List<Countries>> execute = allGenres.execute();
        List<Countries> countries = execute.body();

        return countries;
    }
}
