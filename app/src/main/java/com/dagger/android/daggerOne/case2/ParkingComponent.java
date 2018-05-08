package com.dagger.android.daggerOne.case2;

import dagger.Component;

/**
 * Created by Mr.T on 2018/4/24.
 */
@Component(modules = ParkingModule.class)
public interface ParkingComponent {
    void inject(ParkingActivity activity);
}
