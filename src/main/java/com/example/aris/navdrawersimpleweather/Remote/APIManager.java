package com.example.aris.navdrawersimpleweather.Remote;


import com.example.aris.navdrawersimpleweather.Model.OpenWeatherMap;

import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by rohit on 10/15/15.
 */
public class APIManager {

    private static Mc2Service mc2Service;
    private static final String URL = "http://api.openweathermap.org/data/2.5/weather?";


    public interface Mc2Service {

        @GET("/forecast")
        void getWeatherInfo(@Query("lat=") String latitude,
                            @Query("&lon=") String longitude,
                            @Query("&appid") String appid,
                            Callback<OpenWeatherMap> cb);
    }

    public static Mc2Service getApiService () {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .build();
        mc2Service = (Mc2Service) retrofit.create(OpenWeatherMap.class);
        return mc2Service;

    }

}