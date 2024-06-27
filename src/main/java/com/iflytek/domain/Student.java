package com.iflytek.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


    @Data
    public class Student {
        private Integer id;
        private String mobile;
        private String password;
        private String name;
        private Integer gender;
        private Integer age;
        private Date createTime;
        private Date updateTime;
        private  Integer isDeleted;


    }


