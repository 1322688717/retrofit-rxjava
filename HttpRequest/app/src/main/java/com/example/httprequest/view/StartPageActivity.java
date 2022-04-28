package com.example.httprequest.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;

import com.example.httprequest.R;
import com.llw.mvplibrary.ulits.StatusBarUtil;

public class StartPageActivity extends AppCompatActivity {

    private Button btn_intent;
    final Handler handler = new Handler();
    //实例化一个runable
    private final Runnable runable = this::tologin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        //设置沉浸式状态栏
        StatusBarUtil.initStatusBar(this);

        //绑定控件
        initview();

        //点击跳转
        clicktologin();

        //等待三秒跳转
        waittologin();
    }

    private void tologin() {
        Intent intent = new Intent(StartPageActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    private void clicktologin() {
        btn_intent.setOnClickListener(v -> {
            handler.removeCallbacks(runable);
            tologin();
        });
    }

    private void waittologin() {
        //延迟三秒后实现runable
        handler.postDelayed(runable,3000);
    }

    private void initview() {
        btn_intent = findViewById(R.id.btn_intent);
    }
}