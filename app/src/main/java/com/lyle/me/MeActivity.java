package com.lyle.me;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.lyle.R;
import com.lyle.main.BaseActivity;

public class MeActivity extends BaseActivity implements View.OnClickListener{

    private Button editBtn;
    private ImageButton backBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);

        editBtn=findViewById(R.id.me_edit_btn);
        backBtn=findViewById(R.id.me_back_btn);

        editBtn.setOnClickListener(this);
        backBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.me_edit_btn:

                break;
            case R.id.me_back_btn:
                finish();
                break;
        }
    }
}
