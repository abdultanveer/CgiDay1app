package com.example.cgiday1app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CategoriesActivity extends AppCompatActivity {
    //String[] countries = new String[]{"india","usa","uk"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
       /* //put data into adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, // layout for each row in listview
                countries);//data
        //set adapter on listview
        ListView listView = findViewById(R.id.categories_listview);
        listView.setAdapter(adapter);*/
       setStudentsAdapter();
    }

    private void setStudentsAdapter() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("abdul",123,1));
        students.add(new Student("abdul1",12,12));
        students.add(new Student("abdul2",13,13));
        students.add(new Student("abdul3",23,14));

        StudentAdapter studentAdapter = new StudentAdapter(this,students);
        ListView listView = findViewById(R.id.categories_listview);
        listView.setAdapter(studentAdapter);

    }


}
