package com.dagger.android.daggerThree.case1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

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
        setTitle("DAGGER_THREE_@Scope应用一");
        ParkingComponent component = DaggerParkingComponent.builder().parkingModule(new ParkingModule("楼下老李")).build();
        component.inject(this);
        ((TextView) findViewById(R.id.text)).setText("属性注入成功 = " + mBus.toString());
        component.inject(this);
        ((TextView) findViewById(R.id.text2)).setText("属性注入成功 = " + mBus.toString());
    }
}