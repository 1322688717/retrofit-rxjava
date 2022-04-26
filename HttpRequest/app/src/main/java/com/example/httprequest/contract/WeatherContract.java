package com.example.httprequest.contract;

import android.annotation.SuppressLint;

import com.example.httprequest.api.ApiService;
import com.example.httprequest.bean.BeanNowWeatherResponse;
import com.llw.mvplibrary.base.BasePresenter;
import com.llw.mvplibrary.base.BaseView;
import com.llw.mvplibrary.network.observer.BaseObserver;
import com.llw.network.NetworkApi;

public class WeatherContract {
    public static class WeatherPresenter extends BasePresenter<IWeatherView>{

        @SuppressLint("CheckResult")
        public void getWeather(String key, String location){
            NetworkApi.createService(ApiService.class).getNowWeatherResponse(key, location).compose(NetworkApi.applySchedulers(new BaseObserver<BeanNowWeatherResponse>() {
                @Override
                public void onSuccess(BeanNowWeatherResponse beanNowWeatherResponse) {
                    if (getView()!=null){
                        getView().showTemp(beanNowWeatherResponse.getNow().getTemp());
                    }
                }

                @Override
                public void onFailure(Throwable e) {

                }
            }));
        }
    }

    public interface IWeatherView extends BaseView {
        void showTemp(String response);
    }
}
