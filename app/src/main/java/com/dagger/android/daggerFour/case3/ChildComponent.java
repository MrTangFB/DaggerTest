package com.dagger.android.daggerFour.case3;

import dagger.Subcomponent;

/**
 * Created by Mr.T on 2018/5/17.
 */
@Subcomponent(modules = ChildModule.class)
public interface ChildComponent {

    void inject(ChildActivity activity);
}