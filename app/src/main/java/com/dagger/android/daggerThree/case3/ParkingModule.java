package com.dagger.android.daggerThree.case3;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mr.T on 2018/4/28.
 */
@Module
public class ParkingModule {

    private String driver;

    public ParkingModule(String driver) {
        this.driver = driver;
    }

    @Provides
    public String provideDriver() {
        return driver;
    }

    @Singleton
    @Provides
    public Bus provideBus(String driver) {
        return new Bus(driver);
    }
}
