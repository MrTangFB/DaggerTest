package com.dagger.android.daggerFour.case3;

import dagger.Component;

/**
 * Created by Mr.T on 2018/5/17.
 */
@Component(modules = FatherModule.class)
public interface FatherComponent {

    ChildComponent buildChildComponent();
}