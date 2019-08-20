package com.example.cgiday1app;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    TextView nameTv;
    TextView usnTv;
    TextView semTv;
    public StudentViewHolder(@NonNull View view1) {
        super(view1);
         nameTv = view1.findViewById(R.id.tv_student_name);
         usnTv = view1.findViewById(R.id.tv_student_usn);
         semTv = view1.findViewById(R.id.tv_student_sem);


    }
}
