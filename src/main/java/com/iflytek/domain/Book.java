package com.iflytek.domain;

import lombok.Data;

@Data
public class Book {
        private int id;
        private String bookCno;
        private String bookName;
        private int isValid;
        private int isDeleted;
        private int sort;
        private String createTime;
        private String updateTime;
}