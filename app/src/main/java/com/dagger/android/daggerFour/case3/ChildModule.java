package com.dagger.android.daggerFour.case3;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mr.T on 2018/5/17.
 */
@Module
public class ChildModule {

    @Provides
    public Child provideChild(Father father) {
        return new Child(father);
    }
}
