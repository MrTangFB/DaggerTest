package com.dagger.android.daggerThree.case3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.dagger.android.BaseApplication;
import com.dagger.android.R;

import javax.inject.Inject;

/**
 * Created by Mr.T on 2018/4/24.
 */
public class ParkingActivity extends Activity {

    @Inject
    Bus mBus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);
        setTitle("DAGGER_THREE_@Scope应用二之全局单例");
        BaseApplication.getApplication(this).getComponent().inject(this);
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText("点击跳入下个Activity = " + mBus.toString());
        textView.setFocusable(true);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(ParkingActivity.this, TestActivity.class);
                startActivity(intent);
            }
        });
    }
}