package com.example.myapplicationprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplicationprueba.Retrofit.WeatherServices;
import com.example.myapplicationprueba.models.Main;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
    }

    private void parseData(){
      //  Gson gson=new GsonBuilder().setDateFormat().create();

    }


    private void loadData(){
        GsonBuilder gson = new GsonBuilder();


        Retrofit retrofit2 = new Retrofit.Builder()
                .baseUrl("https://community-open-weather-map.p.rapidapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        WeatherServices service = retrofit2.create(WeatherServices.class);
       Call<Main> data=service.CurrentWeatherData("London,uk");
       data.enqueue(new Callback<Main>() {
                        @Override
                        public void onResponse(Call<Main> call, Response<Main> response) {
                                if(response.isSuccessful()){
                                    System.out.println(response.body().getTemp_max());

                                }
                        }

                        @Override
                        public void onFailure(Call<Main> call, Throwable t) {

                        }
                    }

       );

    }
}

