package com.iflytek.service.impl;

import com.iflytek.domain.Book;
import com.iflytek.mapper.BookMapper;
import com.iflytek.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Service
    public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> booklist() {
        return bookMapper.booklist();
    }

    @Override
    public boolean add(Book book) {
        book.setIsDeleted(0);
        book.setSort(1);
        Date date = new Date();
        String format = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(date);
        book.setCreateTime(format);
        book.setUpdateTime(format);
        int add = bookMapper.add(book);
        if(add > 0){
            return true;
        }else{
            return false;
        }

    }

    @Override
    public List<Book> find(int id) {
        return bookMapper.find(id);
    }

    @Override
    public int update(Book book) {
        return bookMapper.update(book);
    }

    @Override
    public Book detail(int id) {
        return bookMapper.detail(id);
    }


    @Override
    public void remove(int id) {
     bookMapper.remove(id);
    }

    }


