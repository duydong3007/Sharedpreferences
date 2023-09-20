package com.example.sharedfreferencesandroid;

import android.app.Application;

public class  MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        DataLocalMananger.init(getApplicationContext());
    }
}
