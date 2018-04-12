package com.lyle.main;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;

import android.support.design.widget.BottomNavigationView;

import android.view.MenuItem;
import android.view.WindowManager;

import com.lyle.R;
import com.lyle.me.MeActivity;
import com.lyle.share.ShareActivity;


public class MainActivity extends BaseActivity {

    private BottomNavigationView navView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        navView = findViewById(R.id.nav_bottom);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

//    监听nav_bottom的点击事件
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.nav_home:

                    break;
                case R.id.nav_share:
                    startActivity(new Intent(MainActivity.this, ShareActivity.class));
                    break;
                case R.id.nav_me:
                    startActivity(new Intent(MainActivity.this, MeActivity.class));
                    break;
            }
            return true;
        }
    };

}
