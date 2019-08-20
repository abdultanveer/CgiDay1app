package com.example.cgiday1app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {
    RecyclerView studentsListview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("abdul",123,1));
        students.add(new Student("abdul1",12,12));
        students.add(new Student("abdul2",13,13));
        students.add(new Student("abdul3",23,14));

        studentsListview = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerActivity.this);
        studentsListview.setLayoutManager(layoutManager);
        MyStudentAdapter myStudentAdapter = new MyStudentAdapter(students);
        studentsListview.setAdapter(myStudentAdapter);
    }
}
