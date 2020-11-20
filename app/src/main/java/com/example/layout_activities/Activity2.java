package com.example.layout_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void irActividad1(View view) {
        intent = new Intent(view.getContext(),MainActivity.class);
        startActivity(intent);
    }

    public void irActividad3(View view) {
        intent = new Intent(view.getContext(),Activity3.class);
        startActivity(intent);
    }
}