package com.lyle.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.lyle.R;
import com.lyle.main.BaseActivity;

public class RegisterActivity extends BaseActivity implements View.OnClickListener{

    private Button registerBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerBtn = findViewById(R.id.register_btn);

        registerBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.register_btn){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    //向服务器的数据库中写入信息，如果成功,返回登陆页面
                    RegisterActivity.this.finish();
                    //失败 toast相应信息。
                }
            }).start();
        }
    }
}
