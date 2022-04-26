package com.example.httprequest.api;

import com.example.httprequest.bean.BeanNowWeatherResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("/v7/weather/now")
    Observable<BeanNowWeatherResponse> getNowWeatherResponse(@Query("key") String key, @Query("location") String location);
}
