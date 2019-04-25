package com.challenge.simpledaggermvvm.di.module;

import androidx.lifecycle.ViewModelProviders;

import com.challenge.simpledaggermvvm.di.scopes.ActivityScope;
import com.challenge.simpledaggermvvm.ui.MainActivity;
import com.challenge.simpledaggermvvm.ui.SimpleViewModel;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private final MainActivity activity;

    public ActivityModule(MainActivity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityScope
    SimpleViewModel provideSimpleViewModel() {
        return ViewModelProviders.of(activity).get(SimpleViewModel.class);
    }
}
