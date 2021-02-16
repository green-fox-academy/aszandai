package com.example.springadvanced.dao.genre;

import com.example.springadvanced.dao.RetrofitClientInstance;
import com.example.springadvanced.dto.genre.Root;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

@Repository
public class GenreDAO {
    public Root fetchGenres(String apiKey) throws IOException {
        Retrofit retrofitInstance = RetrofitClientInstance.getRetrofitInstance();

        GenreRetrofitDAO genreRetrofitDAO = retrofitInstance.create(GenreRetrofitDAO.class);
        Call<Root> allGenres = genreRetrofitDAO.getGenres(apiKey);
        Response<Root> execute = allGenres.execute();

        return execute.body();
    }
}
