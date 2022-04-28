package com.example.httprequest.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.httprequest.R;
import com.llw.mvplibrary.ulits.StatusBarUtil;

public class RegisterActivity extends AppCompatActivity {

    private EditText edt_account,edt_password;
    private Button btn_register;
    private String account;
    private int passWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        StatusBarUtil.initStatusBar(this);

        initView();

        clienRegister();
    }

    private void clienRegister() {
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getAccountPassWorld();
            }
        });
    }

    /**
     * 获取账号密码
     */
    private void getAccountPassWorld() {
        account = edt_account.getText().toString();
        passWord = Integer.getInteger(edt_password.getText().toString());
    }

    /**
     * 绑定控件
     */
    private void initView() {
        edt_account = findViewById(R.id.edt_account);
        edt_password = findViewById(R.id.edt_password);
        btn_register = findViewById(R.id.btn_register);
    }
}