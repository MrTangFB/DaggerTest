package com.dagger.android.daggerOne.case2;

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
        setTitle("DAGGER_ONE_最简单的例子二");
        //        DaggerParkingComponent.create().inject(this);//DaggerParkingComponent类需要编译才会生成
        DaggerParkingComponent.builder().parkingModule(new ParkingModule("楼下老李")).build().inject(this);
        ((TextView) findViewById(R.id.text)).setText("属性注入成功 = " + mBus.toString());//打印出地址值，注入成功
    }
}