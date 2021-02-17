package com.example.springadvanced.dao.authentication;

import com.example.springadvanced.dao.RetrofitClientInstance;
import com.example.springadvanced.dto.authentication.RequestNewToken;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

@Repository
public class AuthenticationDAO {
    public RequestNewToken fetchNewToken(String apiKey) throws IOException {
        Retrofit retrofitInstance = RetrofitClientInstance.getRetrofitInstance();

        AuthenticationRetrofitDAO authenticationRetrofitDAO = retrofitInstance.create(AuthenticationRetrofitDAO.class);
        Call<RequestNewToken> createToken = authenticationRetrofitDAO.getNewToken(apiKey);
        Response<RequestNewToken> execute = createToken.execute();

        return execute.body();
    }
}
