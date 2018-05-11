package com.dagger.android.daggerThree.case1;

/**
 * Created by Mr.T on 2018/4/24.
 */
public class Bus {

    private String driver;

    public Bus(String driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return super.toString() + " Bus{" +
                "driver='" + driver + '\'' +
                '}';
    }
}