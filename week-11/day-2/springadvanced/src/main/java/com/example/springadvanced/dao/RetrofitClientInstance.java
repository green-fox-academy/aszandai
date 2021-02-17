package com.example.springadvanced.dao;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {

    private static String BASE_URL = "https://api.themoviedb.org";
    private static Retrofit retrofit;

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static Retrofit createToken(String token) {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        if ( token != null ) {
            httpClient.interceptors().clear();
            httpClient.addInterceptor( chain -> {
                Request original = chain.request();
                Request request = original.newBuilder()
                        .header("Authorization", token)
                        .build();
                return chain.proceed(request);
            });
            retrofit.newBuilder().client(httpClient.build());
            retrofit = retrofit.newBuilder().build();
        }
        return retrofit;
    }
}
