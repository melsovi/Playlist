package com.company.playlist;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.company.playlist.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(LayoutInflater.from(getApplicationContext()));
        setContentView(binding.getRoot());
        binding.text.setText(getIntent().getStringExtra("text"));
        binding.text1.setText(getIntent().getStringExtra("text_1"));
    }
}