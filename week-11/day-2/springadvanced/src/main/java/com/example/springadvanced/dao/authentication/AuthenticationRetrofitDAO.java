package com.example.springadvanced.dao.authentication;

import com.example.springadvanced.dto.authentication.RequestNewToken;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AuthenticationRetrofitDAO {
    @GET("/3/authentication/guest_session/new")
    Call<RequestNewToken> getNewToken(@Query("api_key") String apiKey);
}
