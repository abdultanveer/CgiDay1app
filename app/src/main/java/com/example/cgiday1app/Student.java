package com.example.cgiday1app;

public class Student {
    String name;
    int usn;
    int semester;

    public Student(String name, int usn, int semester) {
        this.name = name;
        this.usn = usn;
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUsn() {
        return usn;
    }

    public void setUsn(int usn) {
        this.usn = usn;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
