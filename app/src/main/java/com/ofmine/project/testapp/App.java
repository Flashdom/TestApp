package com.ofmine.project.testapp;

import android.app.Application;

import com.vk.sdk.VKSdk;

public class App extends Application {
    @Override
    public void onCreate() {
        VKSdk.initialize(getApplicationContext());

        super.onCreate();
    }
}
