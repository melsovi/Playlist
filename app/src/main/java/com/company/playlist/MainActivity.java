package com.company.playlist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.container_1, new FirstFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.container_2, new SecondFragment()).commit();
    }
}
