package com.dagger.android.daggerTwo.case1;

import javax.inject.Qualifier;

/**
 * Created by Mr.T on 2018/5/7.
 */
@Qualifier
public @interface Sign {
    String value() default "";
}