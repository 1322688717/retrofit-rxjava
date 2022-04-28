package com.example.httprequest.view;

import android.os.Bundle;

import com.example.httprequest.R;
import com.example.httprequest.contract.WeatherContract;
import com.llw.mvplibrary.mvp.MvpActivity;
import com.llw.mvplibrary.ulits.StatusBarUtil;


public class MainActivity extends MvpActivity<WeatherContract.WeatherPresenter> implements WeatherContract.IWeatherView {


    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected WeatherContract.WeatherPresenter createPresenter() {
        return new WeatherContract.WeatherPresenter();
    }

    /**
     * 主方法
     * @param savedInstanceState
     */
    @Override
    public void initData(Bundle savedInstanceState) {
        initView();
        StatusBarUtil.initStatusBar(context);

    }



    /**
     * 绑定视图
     */
    private void initView() {

    }
}