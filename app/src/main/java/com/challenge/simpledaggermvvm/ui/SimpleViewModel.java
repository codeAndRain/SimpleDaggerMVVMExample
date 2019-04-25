package com.challenge.simpledaggermvvm.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SimpleViewModel extends ViewModel {

    private MutableLiveData<String> messageLiveData = new MutableLiveData<>();

    public SimpleViewModel() {
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }

    void test() {
        messageLiveData.setValue("Success!");
    }

    public MutableLiveData<String> getMessageLiveData() {
        return messageLiveData;
    }
}
