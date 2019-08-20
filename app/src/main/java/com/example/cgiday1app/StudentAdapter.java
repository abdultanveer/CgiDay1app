package com.example.cgiday1app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentAdapter extends BaseAdapter {
    ArrayList<Student> students;
    Context context;

    public StudentAdapter(CategoriesActivity categoriesActivity, ArrayList<Student> students) {
        this.students = students;
        context = categoriesActivity;
    }

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Student getItem(int i) {
        return students.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    /**
     * this method is called when user scrolls and a new empty row gets exposed at
     * the bottom of the screen.
     * @param position
     * @param view
     * @param viewGroup
     * @return
     */
    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(context);
       View view1 = inflater.inflate(R.layout.list_row,viewGroup,false); // creating a wooden plank
        TextView nameTv = view1.findViewById(R.id.tv_student_name);
        TextView usnTv = view1.findViewById(R.id.tv_student_usn);
        TextView semTv = view1.findViewById(R.id.tv_student_sem);

        nameTv.setText(students.get(position).getName());//writing on the wooden plank
        usnTv.setText(""+students.get(position).getUsn());
        semTv.setText(""+students.get(position).getSemester());


        return view1;
    }
}
