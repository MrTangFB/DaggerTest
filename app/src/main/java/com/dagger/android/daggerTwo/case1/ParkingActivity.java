package com.dagger.android.daggerTwo.case1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.dagger.android.R;

import javax.inject.Inject;

/**
 * Created by Mr.T on 2018/4/24.
 */
public class ParkingActivity extends Activity {

    @Sign("laoWang")
    @Inject
    Bus mBus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);
        setTitle("DAGGER_TWO_@Qualifier应用一");
        DaggerParkingComponent.create().inject(this);//DaggerParkingComponent类需要编译才会生成
        ((TextView) findViewById(R.id.text)).setText("属性注入成功 = " + mBus.toString());//重写Bus的toString()方法能看到打印出"隔壁老王"，注入成功
    }
}