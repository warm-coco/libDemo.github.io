package com.iflytek.domain;

import java.util.List;

public class VO {
    private List<Student> studentList;
    public List<Student> getStudentList(){
        return studentList;
    }
    public void setStudentList(List<Student> studentList){
        this.studentList = studentList;
    }

    @Override
    public String toString(){
        return "VO{" +
                "studentList="+studentList+'}';
    }
}
