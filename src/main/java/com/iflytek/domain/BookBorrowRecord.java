package com.iflytek.domain;

import lombok.Data;

import java.util.Date;

@Data
public class BookBorrowRecord {

        private Integer id;
        private Integer bookId;
        private Integer studentId;
        private Date createTime;
        private Date updateTime;
        private Integer bookStatus;
        private  Integer sort;
        private  Integer isDeleted;

}
