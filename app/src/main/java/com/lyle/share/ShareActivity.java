package com.lyle.share;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.lyle.R;
import com.lyle.main.BaseActivity;

public class ShareActivity extends BaseActivity implements View.OnClickListener{

    private Button cancelBtn;
    private Button enterBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        cancelBtn = findViewById(R.id.share_cancel_btn);
        enterBtn = findViewById(R.id.share_enter_btn);

        cancelBtn.setOnClickListener(this);
        enterBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.share_cancel_btn:
                ShareActivity.this.finish();
                break;
            case R.id.share_enter_btn:

                break;
        }

    }
}
