package com.example.viewpagedemo.myviewpager;

import android.animation.ObjectAnimator;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.viewpagedemo.R;

import java.util.Random;


public class TranslateFragment extends Fragment {
    ImageView imageViewTranslation;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_translate, container, false);
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        imageViewTranslation = requireView().findViewById(R.id.imageViewTra);
        imageViewTranslation.setOnClickListener(v -> {
            int factor = new Random().nextInt(200)-100;
            ObjectAnimator.ofFloat(imageViewTranslation, "translationX",imageViewTranslation.getTranslationX()+factor).start();
        });
    }
}