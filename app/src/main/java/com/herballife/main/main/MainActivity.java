package com.herballife.main.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.herballife.main.R;
import com.herballife.main.util.ActivityUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainFragment mainFragment = MainFragment.newInstance();
        ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                mainFragment, R.id.fl_main);
    }
}