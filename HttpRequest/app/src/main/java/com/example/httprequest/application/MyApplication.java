package com.example.httprequest.application;

import android.app.Application;

import com.llw.mvplibrary.BaseApplication;
import com.llw.network.NetworkApi;

public class MyApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化
        NetworkApi.init(new NetworkRequiredInfo(this));
    }

}
