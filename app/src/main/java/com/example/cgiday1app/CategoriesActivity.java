package com.example.cgiday1app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
       String data = getIntent().getExtras().getString(MainActivity.MKEY);
        TextView textView = findViewById(R.id.textViewdata);
        textView.setText(data);

    }
}
