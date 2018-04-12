package com.lyle.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.lyle.R;
import com.lyle.main.BaseActivity;
import com.lyle.main.MainActivity;

public class LoginActivity extends BaseActivity implements View.OnClickListener{

    private Button loginBtn;
    private Button registerBtn;
    private boolean login_OK=false;
    private SharedPreferences.Editor loginState;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginBtn = findViewById(R.id.login_btn);
        registerBtn = findViewById(R.id.login_register_btn);

        loginBtn.setOnClickListener(this);
        registerBtn.setOnClickListener(this);

        loginState=getSharedPreferences("loginState",MODE_PRIVATE)
                .edit();
        loginState.putBoolean("state",false);
        loginState.apply();
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.login_btn){
            //读取loginState的状态
            SharedPreferences pref=getSharedPreferences("loginState", MODE_PRIVATE);
            login_OK=pref.getBoolean("state",false);

            if(!login_OK){
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        //向服务器查询正确性，如果正确
                        loginState.putBoolean("state",true);
                        loginState.apply();
                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(intent);
                        LoginActivity.this.finish();
                        //错误 Toast.makeText(this,"账号或密码错误",Toast.LENGTH_SHORT).show();
                    }
                }).start();

            }else {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                LoginActivity.this.finish();
            }


        }else if(view.getId()==R.id.login_register_btn){
            //注册逻辑,start RegisterActivity
            Intent intent = new Intent(this,RegisterActivity.class);
            startActivity(intent);
        }
    }
}
