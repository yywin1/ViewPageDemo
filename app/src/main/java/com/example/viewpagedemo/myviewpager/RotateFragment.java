package com.example.viewpagedemo.myviewpager;

import android.animation.ObjectAnimator;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.viewpagedemo.R;

public class RotateFragment extends Fragment {
    ImageView imageViewRotation;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_rotate, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        imageViewRotation = requireView().findViewById(R.id.imageViewRotate);
        imageViewRotation.setOnClickListener(v -> {
            Log.d("TAG", "皮卡丘");
            ObjectAnimator.ofFloat(imageViewRotation, "rotation", imageViewRotation.getRotation() + 30f).start();
        });
    }
}