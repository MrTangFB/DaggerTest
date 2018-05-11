package com.dagger.android;

import android.app.Application;
import android.content.Context;

import com.dagger.android.daggerThree.case2.DaggerUserComponent;
import com.dagger.android.daggerThree.case2.UserComponent;
import com.dagger.android.daggerThree.case2.UserModule;
import com.dagger.android.daggerThree.case3.DaggerParkingComponent;
import com.dagger.android.daggerThree.case3.ParkingComponent;
import com.dagger.android.daggerThree.case3.ParkingModule;

/**
 * Created by Mr.T on 2018/5/11.
 */

public class BaseApplication extends Application {

    public static BaseApplication getApplication(Context context) {
        return (BaseApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        ininDaggerThreeCase3();
    }

    /*************************************************************************/
    //DaggerThreeCase2
    UserComponent userComponent;

    public void ininDaggerThreeCase2(String name) {
        userComponent = DaggerUserComponent.builder().userModule(new UserModule(name)).build();
    }

    public UserComponent getUserComponent() {
        return userComponent;
    }

    public void releaseUserComponent() {
        userComponent = null;
    }

    /*************************************************************************/
    //DaggerThreeCase3
    ParkingComponent parkingComponent;

    private void ininDaggerThreeCase3() {
        parkingComponent = DaggerParkingComponent.builder().parkingModule(new ParkingModule("楼下老李")).build();
    }

    public ParkingComponent getComponent() {
        return parkingComponent;
    }
}