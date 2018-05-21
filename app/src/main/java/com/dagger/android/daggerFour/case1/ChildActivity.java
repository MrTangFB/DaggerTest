package com.dagger.android.daggerFour.case1;

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
        setTitle("DAGGER_FOUR_Dependencies与SubComponent应用一");
        FatherComponent fatherComponent = DaggerFatherComponent.create();
        DaggerChildComponent.builder().fatherComponent(fatherComponent).childModule(new ChildModule("小王")).build().inject(this);//Component类需要编译才会生成
        ((TextView) findViewById(R.id.text)).setText("注入成功 = " + mChild.toString());
    }
}