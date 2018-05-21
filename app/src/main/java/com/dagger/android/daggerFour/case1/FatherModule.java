package com.dagger.android.daggerFour.case1;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mr.T on 2018/5/17.
 */
@Module
public class FatherModule {

    @Singleton
    @Provides
    public Father provideFather() {
        return new Father();
    }
}
