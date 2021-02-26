package com.example.myapplicationprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplicationprueba.Retrofit.WeatherServices;
import com.example.myapplicationprueba.models.Main;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Retrofit;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void parseData(){
      //  Gson gson=new GsonBuilder().setDateFormat().create();

    }


    private void loadData(){
        GsonBuilder gson = new GsonBuilder();


        Retrofit retrofit2 = new Retrofit.Builder()
                .baseUrl("https://community-open-weather-map.p.rapidapi.com/")
                .build();

        WeatherServices service = retrofit2.create(WeatherServices.class);
       Call<Main> data=service.CurrentWeatherData("London,uk");

    }
}

