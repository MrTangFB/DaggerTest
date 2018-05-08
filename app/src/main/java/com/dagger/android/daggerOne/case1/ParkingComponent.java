package com.dagger.android.daggerOne.case1;

import dagger.Component;

/**
 * Created by Mr.T on 2018/4/24.
 */
@Component
public interface ParkingComponent {
    void inject(ParkingActivity activity);
}
