package com.example.layout_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity3 extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }

    public void irActividad1(View view) {
        intent = new Intent(view.getContext(),MainActivity.class);
        startActivity(intent);
    }

    public void irActividad2(View view) {
        intent = new Intent(view.getContext(),Activity2.class);
        startActivity(intent);
    }
}