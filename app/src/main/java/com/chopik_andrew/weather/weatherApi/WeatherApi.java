package com.chopik_andrew.weather.weatherApi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Andrew on 12.06.2017.
 */

public interface WeatherApi {
    @GET("/data/2.5/weather")
    Call<WeatherModel> getData(@Query("lat") double latitude, @Query("lon") double longitude, @Query("APPID") String key);
}
