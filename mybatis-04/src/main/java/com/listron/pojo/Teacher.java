package com.listron.pojo;

import java.io.Serializable;
import java.util.List;

public class Teacher implements Serializable {
    private int id;
    private String name;

    private List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher: id="+id +" name="+name + "studentList=" + studentList +"\n";
    }
}
