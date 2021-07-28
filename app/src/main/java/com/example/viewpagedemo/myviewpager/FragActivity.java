package com.example.viewpagedemo.myviewpager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.util.Log;

import com.example.viewpagedemo.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class FragActivity extends AppCompatActivity {

    ViewPager2 viewPager;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);

        viewPager.setAdapter(new FragmentStateAdapter(this) {
            @NonNull
            @Override
            public Fragment createFragment(int position) {
                switch (position){
                    case 0:
                        Log.e("RotateFragment","RotateFragment");
                        return new RotateFragment();
                    case 1:
                        Log.e("ScaleFragment","ScaleFragment");
                        return  new ScaleFragment();
                    default:
                        Log.e("TranslateFragment","TranslateFragment");
                        return new TranslateFragment();
                }
            }

            @Override
            public int getItemCount() {
                return 3;
            }
        });

        new TabLayoutMediator(tabLayout,viewPager,(tab, position) -> {
            switch (position){
                case 0:
                    Log.e("pageerr","page0");
                    tab.setText("缩放");
                    break;
                case 1:
                    tab.setText("旋转");
                    break;
                case 2:
                    tab.setText("移动");
                    break;
            }
        }).attach();
    }
}