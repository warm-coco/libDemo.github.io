package com.iflytek.controller;

import com.iflytek.domain.Student;
import com.iflytek.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private HttpServletRequest request;

    //登录
    @RequestMapping("/login")
    public String login(String mobile,String password) throws Exception {
        System.out.println(mobile+":"+password);

        Student student = studentService.login(mobile, password);
        if(null == student){
            request.getServletContext().setAttribute("message","用户名或密码错误！！！");
            return "login";
        }
        request.getServletContext().setAttribute("student",student);

        return "redirect:/book/list";

    }
    //注册
    @RequestMapping("/register")
    public  String register(Student student){
        Student student1 = studentService.checkReg(student.getMobile());
        if (student1 == null){
            studentService.register(student);
            return "login";
        }
        System.out.println("用户名已存在");
        return "regist";
    }

 }
