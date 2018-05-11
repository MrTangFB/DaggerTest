package com.dagger.android.daggerThree.case3;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Mr.T on 2018/4/24.
 */
@Singleton
@Component(modules = ParkingModule.class)
public interface ParkingComponent {
    void inject(ParkingActivity activity);

    void inject(TestActivity activity);
}