package com.challenge.simpledaggermvvm.di.module;

import android.content.Context;

import com.challenge.simpledaggermvvm.App;
import com.challenge.simpledaggermvvm.di.scopes.AppScope;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

@Module
public class AppModule {

    private final App appContext;

    public AppModule(App appContext) {
        this.appContext = appContext;
    }

    @Provides
    @AppScope
    Context provideAppContext() {
        return appContext;
    }


    @Provides
    @AppScope
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }
}
