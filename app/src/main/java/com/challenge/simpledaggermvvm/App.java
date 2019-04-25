package com.challenge.simpledaggermvvm;

import android.app.Application;
import android.content.Context;

import com.challenge.simpledaggermvvm.di.component.AppComponent;
import com.challenge.simpledaggermvvm.di.component.DaggerAppComponent;
import com.challenge.simpledaggermvvm.di.module.AppModule;

public class App extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public static App getInstance(Context context) {
        return (App) context.getApplicationContext();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

}
