package com.dagger.android.daggerThree.case2;

/**
 * Created by Mr.T on 2018/4/24.
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString() + " = User{" +
                "name='" + name + '\'' +
                '}';
    }
}