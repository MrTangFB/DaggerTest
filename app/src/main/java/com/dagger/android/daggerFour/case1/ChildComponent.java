package com.dagger.android.daggerFour.case1;

import dagger.Component;

/**
 * Created by Mr.T on 2018/5/17.
 */
@SignLocal
@Component(modules = ChildModule.class, dependencies = FatherComponent.class)
public interface ChildComponent {

    void inject(ChildActivity activity);
}
