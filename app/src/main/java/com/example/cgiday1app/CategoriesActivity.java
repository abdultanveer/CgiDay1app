package com.example.cgiday1app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class CategoriesActivity extends AppCompatActivity {
    String[] countries = new String[]{"india","usa","uk"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        //put data into adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, // layout for each row in listview
                countries);//data
        //set adapter on listview
        ListView listView = findViewById(R.id.categories_listview);
        listView.setAdapter(adapter);


    }
}
