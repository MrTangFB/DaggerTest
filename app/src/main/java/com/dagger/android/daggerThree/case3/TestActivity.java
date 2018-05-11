package com.dagger.android.daggerThree.case3;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.dagger.android.BaseApplication;
import com.dagger.android.R;

import javax.inject.Inject;

/**
 * Created by Mr.T on 2018/4/24.
 */
public class TestActivity extends Activity {

    @Inject
    Bus mBus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);
        setTitle("DAGGER_THREE_@Scope应用二之验证界面");
        BaseApplication.getApplication(this).getComponent().inject(this);
        ((TextView) findViewById(R.id.text)).setText("我是验证的数据 = " + mBus.toString());
    }
}