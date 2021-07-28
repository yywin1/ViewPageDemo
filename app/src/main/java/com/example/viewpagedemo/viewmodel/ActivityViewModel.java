package com.example.viewpagedemo.viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.viewpagedemo.R;
import com.example.viewpagedemo.databinding.ActivityViewModelBinding;

public class ActivityViewModel extends AppCompatActivity {
   MyViewModel myViewModel;

    //    TextView txtView;
//    Button btn;
    //替换
    ActivityViewModelBinding bind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        txtView = findViewById(R.id.txt);
//        btn = findViewById(R.id.btn);
        //替换
        bind = DataBindingUtil.setContentView(this, R.layout.activity_main);

        myViewModel = ViewModelProviders.of(this).get(MyViewModel.class);
        bind.setData(myViewModel);
        bind.setLifecycleOwner(this);

//        myViewModel.getString().observe(this,new Observer<String>() {
//            @Override
//            public void onChanged(String s) {
//
//            }
//        });

        //Activity发生改变使重新初始化txtView
        //txtView.setText(String.valueOf(myViewModel.num));
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                myViewModel.num++;
//                txtView.setText(String.valueOf(myViewModel.num));
//            }
//        });
    }
}