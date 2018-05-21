package com.dagger.android.daggerFour.case1;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Mr.T on 2018/5/17.
 */
@Singleton
@Component(modules = FatherModule.class)
public interface FatherComponent {

    Father offerFather();
}
