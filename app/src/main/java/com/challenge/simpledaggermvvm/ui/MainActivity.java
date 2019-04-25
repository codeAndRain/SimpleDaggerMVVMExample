package com.challenge.simpledaggermvvm.ui;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.challenge.simpledaggermvvm.App;
import com.challenge.simpledaggermvvm.R;
import com.challenge.simpledaggermvvm.di.component.DaggerActivityComponent;
import com.challenge.simpledaggermvvm.di.module.ActivityModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
   SimpleViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .appComponent(App.getInstance(this).getAppComponent())
                .build().inject(this);


        viewModel.test();

        viewModel.getMessageLiveData().observe(this, message -> Toast.makeText(this, message, Toast.LENGTH_SHORT).show());
    }
}
