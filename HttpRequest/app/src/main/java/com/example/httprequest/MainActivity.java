package com.example.httprequest;

import android.os.Bundle;
import android.widget.TextView;
import com.example.httprequest.contract.WeatherContract;
import com.llw.mvplibrary.mvp.MvpActivity;


public class MainActivity extends MvpActivity<WeatherContract.WeatherPresenter> implements WeatherContract.IWeatherView {

    private TextView tv_temp;
    private String key = "66d721a1d6024ca8b6c257fcab036de7";
    private String location = "101010100";

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

        mPresenter.getWeather(key,location);
    }

    /**
     * 显示温度
     * @param temp
     */
    @Override
    public void showTemp(String temp) {
        tv_temp.setText(temp);
    }


    /**
     * 绑定视图
     */
    private void initView() {
        tv_temp = findViewById(R.id.tv_temp);
    }
}