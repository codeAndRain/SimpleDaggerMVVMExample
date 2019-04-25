package com.challenge.simpledaggermvvm.di.component;

import android.content.Context;

import com.challenge.simpledaggermvvm.di.module.AppModule;
import com.challenge.simpledaggermvvm.di.scopes.AppScope;

import dagger.Component;
import io.reactivex.disposables.CompositeDisposable;

@AppScope
@Component(modules = AppModule.class)
public interface AppComponent {

    // Expose for injection
    Context context();
    CompositeDisposable comositeDisposable();
}
