package com.iflytek.service;

import com.iflytek.domain.Book;

import java.util.List;

public interface BookService {

     List<Book> booklist();

      boolean add(Book book);

    List<Book> find(int id);

       int  update(Book book);

       Book detail(int id); ;

      void   remove(int id) ;

}

