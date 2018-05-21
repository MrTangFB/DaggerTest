package com.dagger.android.daggerFour.case3;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.dagger.android.R;

import javax.inject.Inject;

/**
 * Created by Mr.T on 2018/4/24.
 */
public class ChildActivity extends Activity {

    @Inject
    Child mChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);
        setTitle("DAGGER_FOUR_Dependencies与SubComponent应用三");
        FatherComponent fatherComponent = DaggerFatherComponent.create();
        fatherComponent.buildChildComponent().inject(this);
        ((TextView) findViewById(R.id.text)).setText("注入成功 = " + mChild.toString());
    }
}