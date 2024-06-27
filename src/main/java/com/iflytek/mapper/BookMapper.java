package com.iflytek.mapper;

import com.iflytek.domain.Book;
import java.util.List;

public interface BookMapper {
    List<Book> booklist();

    int add(Book book);

    List<Book> find(int id);

    int update(Book book);

    Book detail(int id);

    void remove(int id);

}