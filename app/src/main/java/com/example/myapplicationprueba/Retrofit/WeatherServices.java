package com.example.myapplicationprueba.Retrofit;

import com.example.myapplicationprueba.models.Main;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherServices {

    @GET("weather")
    Call<Main> CurrentWeatherData(@Query("q") String location);

}
