package com.example.springadvanced.dao.countries;

import com.example.springadvanced.dto.Countries;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface CountriesRetrofitDAO {
    @GET("/3/configuration/countries")
    Call<List<Countries>> getCountries(@Query("api_key") String apiKey);
}
