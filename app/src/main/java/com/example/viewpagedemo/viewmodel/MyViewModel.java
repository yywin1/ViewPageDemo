package com.example.viewpagedemo.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    //XML binding数据都需要public
    public MutableLiveData<Integer> num;
    public void add(){
        num.setValue(num.getValue()+1);
    }
    public MutableLiveData<Integer> getNum()
    {
        if(num==null){
            num = new MutableLiveData<>();
            num.setValue(0);
        }
        return num;
    }
}