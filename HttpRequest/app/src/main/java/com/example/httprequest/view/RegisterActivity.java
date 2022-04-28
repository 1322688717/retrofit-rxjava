package com.example.httprequest.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.httprequest.R;
import com.llw.mvplibrary.ulits.StatusBarUtil;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        StatusBarUtil.initStatusBar(this);


    }
}