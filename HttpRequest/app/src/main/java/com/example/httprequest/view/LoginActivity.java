package com.example.httprequest.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.httprequest.R;
import com.llw.mvplibrary.ulits.StatusBarUtil;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edt_account,edt_password;
    private Button btn_login;
    private TextView tv_register,tv_forget;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        StatusBarUtil.initStatusBar(this);

        initView();


    }

    /**
     * 绑定视图
     */
    private void initView() {
        edt_account = findViewById(R.id.edt_account);
        edt_password = findViewById(R.id.edt_password);
        btn_login = findViewById(R.id.btn_login);
        tv_register = findViewById(R.id.tv_register);
        tv_forget = findViewById(R.id.tv_forget);

        btn_login.setOnClickListener(this);
        tv_forget.setOnClickListener(this);
        tv_register.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_login:
                intent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            break;
            case R.id.tv_forget:
                intent = new Intent(LoginActivity.this,ForgetActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_register:
                intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
                break;

        }
    }
}