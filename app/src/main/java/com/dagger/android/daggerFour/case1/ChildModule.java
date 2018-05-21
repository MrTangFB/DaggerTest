package com.dagger.android.daggerFour.case1;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mr.T on 2018/5/17.
 */
@Module
public class ChildModule {

    private String name;

    public ChildModule(String name) {
        this.name = name;
    }

    @Provides
    public String provideString() {
        return name;
    }

    @SignLocal
    @Provides
    public Child provideChild(Father father, String name) {
        return new Child(father, name);
    }
}
