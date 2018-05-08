package com.dagger.android.daggerTwo.case1;

import dagger.Component;

/**
 * Created by Mr.T on 2018/4/24.
 */
@Component(modules = ParkingModule.class)
public interface ParkingComponent {
    void inject(ParkingActivity activity);
}