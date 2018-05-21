package com.dagger.android.daggerFour.case2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mr.T on 2018/5/17.
 */
@Module(subcomponents = ChildComponent.class)
public class FatherModule {

    @Provides
    public Father provideFather() {
        return new Father();
    }
}