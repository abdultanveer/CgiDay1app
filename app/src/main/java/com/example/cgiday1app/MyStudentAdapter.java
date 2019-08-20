package com.example.cgiday1app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyStudentAdapter extends  RecyclerView.Adapter{
ArrayList<Student> students;

    public MyStudentAdapter(ArrayList<Student> students) {
        this.students = students;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_row, parent, false);

        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        StudentViewHolder studentViewHolder = (StudentViewHolder) holder;
        studentViewHolder.nameTv.setText(students.get(position).getName());//writing on the wooden plank
        studentViewHolder.usnTv.setText(""+students.get(position).getUsn());
        studentViewHolder.semTv.setText(""+students.get(position).getSemester());

    }

    @Override
    public int getItemCount() {
        return students.size();
    }
}
