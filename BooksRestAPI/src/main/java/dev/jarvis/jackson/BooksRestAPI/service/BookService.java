package dev.jarvis.jackson.BooksRestAPI.service;


import dev.jarvis.jackson.BooksRestAPI.model.Book;

import java.util.List;

public interface BookService {

    List<Book> list();

    Book get(int id);

    void create(Book book);

    void update(Book book, int id);

    void delete(int id);
}
