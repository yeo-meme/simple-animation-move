package com.nalazoocare.objanimation;

import android.animation.ObjectAnimator;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.nalazoocare.objanimation.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        ObjectAnimator animator = ObjectAnimator.ofFloat(binding.cheese, "translationY" , 100f);
        animator.setDuration(2000);
        animator.start();
    }
}
