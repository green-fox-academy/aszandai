package com.example.springadvanced.dao;

import com.example.springadvanced.dto.Countries;
import com.example.springadvanced.dto.Genre;
import com.example.springadvanced.dto.Root;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

@Repository
public class GenreDAO {
    public List<Genre> fetchGenres(String apiKey) throws IOException {
        Retrofit retrofitInstance = RetrofitClientInstance.getRetrofitInstance();

        GenreRetrofitDAO genreRetrofitDAO = retrofitInstance.create(GenreRetrofitDAO.class);
        Call<List<Genre>> allGenres = genreRetrofitDAO.getGenres(apiKey);

        Response<List<Genre>> execute = allGenres.execute();

        return execute.body();
    }
}
