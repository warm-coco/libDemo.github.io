package com.iflytek.mapper;

import com.iflytek.domain.Student;

public interface StudentMapper {
    Student login(String mobile);

    int register(Student student);

    Student checkReg(String mobile) ;
    }
