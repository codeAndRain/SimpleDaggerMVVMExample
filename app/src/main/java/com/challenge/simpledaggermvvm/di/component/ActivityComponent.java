package com.challenge.simpledaggermvvm.di.component;

import com.challenge.simpledaggermvvm.di.module.ActivityModule;
import com.challenge.simpledaggermvvm.di.scopes.ActivityScope;
import com.challenge.simpledaggermvvm.ui.MainActivity;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity activity);
}
