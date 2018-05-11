package com.dagger.android.daggerThree.case2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.dagger.android.BaseApplication;
import com.dagger.android.R;

import javax.inject.Inject;

/**
 * Created by Mr.T on 2018/4/24.
 */
public class LoginActivity extends Activity {

    EditText editText;

    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("DAGGER_THREE_@Scope应用二之局部单例");
        editText = (EditText) findViewById(R.id.editText);
        ((Button) findViewById(R.id.btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString().trim();
                if (TextUtils.isEmpty(name)) {
                    Toast.makeText(LoginActivity.this, "客官不可以！", Toast.LENGTH_SHORT).show();
                } else {
                    if (BaseApplication.getApplication(LoginActivity.this).getUserComponent() == null)
                        BaseApplication.getApplication(LoginActivity.this).ininDaggerThreeCase2(name);
                    Intent intent = new Intent();
                    intent.setClass(LoginActivity.this, TestActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        UserComponent userComponent = BaseApplication.getApplication(this).getUserComponent();
        if (userComponent == null) {
            ((TextView) findViewById(R.id.text)).setText("还未登陆");
        } else {
            userComponent.inject(this);
            ((TextView) findViewById(R.id.text)).setText("登陆成功了 = " + user.toString());
        }
    }
}