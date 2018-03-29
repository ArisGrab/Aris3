package com.example.aris.navdrawersimpleweather.Remote;


import com.example.aris.navdrawersimpleweather.Model.Weather;



/**
 * Created by rohit on 10/15/15.
 */
public interface HttpCallback {

    public void onSuccess(Weather response);

    public void onFailure(String error);

}