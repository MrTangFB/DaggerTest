package com.dagger.android.daggerThree.case2;

import dagger.Component;

/**
 * Created by Mr.T on 2018/4/24.
 */
@UserScope
@Component(modules = UserModule.class)
public interface UserComponent {
    void inject(TestActivity activity);

    void inject(LoginActivity activity);
}