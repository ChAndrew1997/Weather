package com.chopik_andrew.weather;

import android.app.Application;

import com.chopik_andrew.weather.weatherApi.WeatherApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Andrew on 12.06.2017.
 */

public class App extends Application {
    private static WeatherApi weatherApi;
    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();

        retrofit = new Retrofit.Builder()
                .baseUrl("http://api.openweathermap.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        weatherApi = retrofit.create(WeatherApi.class);
    }

    public static WeatherApi getWeatherApi(){
        return weatherApi;
    }
}
