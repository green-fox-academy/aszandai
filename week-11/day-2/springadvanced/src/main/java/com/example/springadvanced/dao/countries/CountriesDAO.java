package com.example.springadvanced.dao.countries;

import com.example.springadvanced.dao.RetrofitClientInstance;
import com.example.springadvanced.dto.Countries;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

@Repository
public class CountriesDAO {
    public List<Countries> fetchCountries(String apiKey) throws IOException {
        Retrofit retrofitInstance = RetrofitClientInstance.getRetrofitInstance();

        CountriesRetrofitDAO countriesRetrofitDAO = retrofitInstance.create(CountriesRetrofitDAO.class);
        Call<List<Countries>> allCountries = countriesRetrofitDAO.getCountries(apiKey);
        Response<List<Countries>> execute = allCountries.execute();

        return execute.body();
    }
}
