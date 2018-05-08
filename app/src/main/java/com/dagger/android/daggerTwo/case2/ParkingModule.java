package com.dagger.android.daggerTwo.case2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mr.T on 2018/4/28.
 */
@Module
public class ParkingModule {

    @Sign("lw")
    @Provides
    public String provideDriverW() {
        return "隔壁老王";
    }

    @Provides
    public String provideDriverL() {
        return "楼下老李";
    }

    @Sign("noDriver")
    @Provides
    public Bus provideBus() {
        return new Bus();
    }

    @Sign("laoWang")
    @Provides
    public Bus provideBusHasDriver(@Sign("lw") String driver) {
        return new Bus(driver);
    }
}
