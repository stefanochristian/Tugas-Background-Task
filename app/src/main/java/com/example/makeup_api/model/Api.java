package com.example.makeup_api.model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

    String BASE_URL = "https://makeup-api.herokuapp.com/api/v1/";
    @GET("products.json")
    Call<List<Results>> getMakeup(@Query("brand") String brand);
}