package com.dagger.android.daggerTwo.case2;

/**
 * Created by Mr.T on 2018/4/24.
 */
public class Bus {

    private String driver;

    public Bus() {

    }

    public Bus(String driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "driver='" + driver + '\'' +
                '}';
    }
}
