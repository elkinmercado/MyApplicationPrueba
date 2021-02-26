package com.example.myapplicationprueba.Retrofit;

import com.example.myapplicationprueba.models.Main;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface WeatherServices {
    @Headers({
            "x-rapidapi-key: 9efcf42886mshfc9edc7e97eaa8dp123ddfjsn80941e4feb6c",
            "x-rapidapi-host: community-open-weather-map.p.rapidapi.com",
            "useQueryString:true"
    })
    @GET("weather")
    Call<Main> CurrentWeatherData(@Query("q") String location);

}
