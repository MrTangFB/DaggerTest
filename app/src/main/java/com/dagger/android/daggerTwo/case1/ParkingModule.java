package com.dagger.android.daggerTwo.case1;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mr.T on 2018/4/28.
 */
@Module
public class ParkingModule {

    @Sign("noDriver")
    @Provides
    public Bus provideBus() {
        return new Bus();
    }

    @Sign("laoWang")
    @Provides
    public Bus provideBusHasDriver() {
        return new Bus("隔壁老王");
    }
}
