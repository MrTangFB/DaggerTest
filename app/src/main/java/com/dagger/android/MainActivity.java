package com.dagger.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dagger.android.daggerThree.case2.LoginActivity;

/**
 * Created by Mr.T on 2018/4/27.
 */

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button dagger_one_1 = (Button) findViewById(R.id.dagger_one_1);
        dagger_one_1.setOnClickListener(this);
        Button dagger_one_2 = (Button) findViewById(R.id.dagger_one_2);
        dagger_one_2.setOnClickListener(this);
        Button dagger_two_1 = (Button) findViewById(R.id.dagger_two_1);
        dagger_two_1.setOnClickListener(this);
        Button dagger_two_2 = (Button) findViewById(R.id.dagger_two_2);
        dagger_two_2.setOnClickListener(this);
        Button dagger_three_1 = (Button) findViewById(R.id.dagger_three_1);
        dagger_three_1.setOnClickListener(this);
        Button dagger_three_2 = (Button) findViewById(R.id.dagger_three_2);
        dagger_three_2.setOnClickListener(this);
        Button dagger_three_3 = (Button) findViewById(R.id.dagger_three_3);
        dagger_three_3.setOnClickListener(this);
        Button dagger_four_1 = (Button) findViewById(R.id.dagger_four_1);
        dagger_four_1.setOnClickListener(this);
        Button dagger_four_2 = (Button) findViewById(R.id.dagger_four_2);
        dagger_four_2.setOnClickListener(this);
        Button dagger_four_3 = (Button) findViewById(R.id.dagger_four_3);
        dagger_four_3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.dagger_one_1:
                intent.setClass(this, com.dagger.android.daggerOne.case1.ParkingActivity.class);
                break;
            case R.id.dagger_one_2:
                intent.setClass(this, com.dagger.android.daggerOne.case2.ParkingActivity.class);
                break;
            case R.id.dagger_two_1:
                intent.setClass(this, com.dagger.android.daggerTwo.case1.ParkingActivity.class);
                break;
            case R.id.dagger_two_2:
                intent.setClass(this, com.dagger.android.daggerTwo.case2.ParkingActivity.class);
                break;
            case R.id.dagger_three_1:
                intent.setClass(this, com.dagger.android.daggerThree.case1.ParkingActivity.class);
                break;
            case R.id.dagger_three_2:
                intent.setClass(this, LoginActivity.class);
                break;
            case R.id.dagger_three_3:
                intent.setClass(this, com.dagger.android.daggerThree.case3.ParkingActivity.class);
                break;
            case R.id.dagger_four_1:
                intent.setClass(this, com.dagger.android.daggerFour.case1.ChildActivity.class);
                break;
            case R.id.dagger_four_2:
                intent.setClass(this, com.dagger.android.daggerFour.case2.ChildActivity.class);
                break;
            case R.id.dagger_four_3:
                intent.setClass(this, com.dagger.android.daggerFour.case3.ChildActivity.class);
                break;
        }
        startActivity(intent);
    }
}
