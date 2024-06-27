package com.iflytek.service;

import com.iflytek.domain.Student;

public interface StudentService {

     Student login (String mobile, String password);

    void register(Student student);

    Student checkReg(String name);

}

