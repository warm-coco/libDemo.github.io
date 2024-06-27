package com.iflytek.service.impl;

import com.iflytek.domain.Student;
import com.iflytek.service.StudentService;
import com.iflytek.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private  StudentMapper studentMapper;

    @Override
    public Student login(String mobile, String password) {
        Student student = studentMapper.login(mobile);
        if(null == student || !password.equals(student.getPassword())){
            return null;
        }
        return student;
    }

    @Override
    public void register(Student student) {
        studentMapper.register(student);
    }

    @Override
    public Student checkReg(String mobile) {
        return studentMapper.checkReg(mobile);
    }

}

