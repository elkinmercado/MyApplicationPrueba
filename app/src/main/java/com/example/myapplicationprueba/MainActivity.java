package com.example.myapplicationprueba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.myapplicationprueba.Retrofit.WeatherServices;
import com.example.myapplicationprueba.models.GeneralClass;
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

        Fragment fragment= new MapFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_mapView,fragment).commit();

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
       Call<GeneralClass> data=service.CurrentWeatherData("London");
       data.enqueue(new Callback<GeneralClass>() {
                        @Override
                        public void onResponse(Call<GeneralClass> call, Response<GeneralClass> response) {
                                if(response.isSuccessful()){
                                    System.out.println(response.body().getName());

                                }
                        }

                        @Override
                        public void onFailure(Call<GeneralClass> call, Throwable t) {

                        }
                    }

       );

    }
}

