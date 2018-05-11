package com.dagger.android.daggerThree.case2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.dagger.android.BaseApplication;
import com.dagger.android.R;

import javax.inject.Inject;

/**
 * Created by Mr.T on 2018/4/24.
 */
public class TestActivity extends Activity {

    @Inject
    User user;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);
        setTitle("DAGGER_THREE_@Scope应用二之验证界面");
        textView = (TextView) findViewById(R.id.text);
        textView.setFocusable(true);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BaseApplication.getApplication(TestActivity.this).releaseUserComponent();
                finish();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        UserComponent userComponent = BaseApplication.getApplication(this).getUserComponent();
        if (userComponent != null) {
            userComponent.inject(this);
            textView.setText("点击退出登陆 = 登陆成功了 = " + user.toString());
        }
    }
}