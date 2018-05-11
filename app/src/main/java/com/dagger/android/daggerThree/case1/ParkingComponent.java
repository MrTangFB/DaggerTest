package com.dagger.android.daggerThree.case1;

import dagger.Component;

/**
 * Created by Mr.T on 2018/4/24.
 */
@SignLocal
@Component(modules = ParkingModule.class)
public interface ParkingComponent {
    void inject(ParkingActivity activity);
}
