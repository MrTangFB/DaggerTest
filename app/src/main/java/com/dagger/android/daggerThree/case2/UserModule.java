package com.dagger.android.daggerThree.case2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mr.T on 2018/4/28.
 */
@Module
public class UserModule {

    private String name;

    public UserModule(String name) {
        this.name = name;
    }

    @Provides
    public String provideName() {
        return name;
    }

    @UserScope
    @Provides
    public User provideUser(String name) {
        return new User(name);
    }
}
