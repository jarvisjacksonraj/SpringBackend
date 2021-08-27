package dev.jarvis.jackson.BooksRestAPI.service.impl;


import dev.jarvis.jackson.BooksRestAPI.model.Book;
import dev.jarvis.jackson.BooksRestAPI.respository.BookRowMapper;
import dev.jarvis.jackson.BooksRestAPI.service.BookService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private JdbcTemplate jdbcTemplate;

    public BookServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Book> list() {
        String sql = "SELECT * FROM BOOK";
        List<Book> books = jdbcTemplate.query(sql, new BookRowMapper());
        return books;
    }

    @Override
    public Book get(int id) {
        String sql = "SELECT * FROM BOOK WHERE ID = ?";
        return jdbcTemplate.queryForObject(sql, new BookRowMapper(), new Object[]{id});
    }

    @Override
    public void create(Book book) {
        String sql = "insert into book(id,title,author,publisher,release_date,isbn,topic) values (?,?,?,?,?,?,?)";
        int insert = jdbcTemplate.update(sql,
                book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getPublisher(),
                book.getReleaseDate(),
                book.getIsbn(),
                book.getTopic());

        if (insert == 1) {
            System.out.println("A new book was inserted into the database: " + book.getTitle());
        }
    }

    @Override
    public void update(Book book, int id) {
        String sql = "update book set title = ?, author = ?, publisher = ?, release_date = ?, isbn = ?, topic =? where id = ?";
        int update = jdbcTemplate.update(sql,
                book.getTitle(),
                book.getAuthor(),
                book.getPublisher(),
                book.getReleaseDate(),
                book.getIsbn(),
                book.getTopic(),
                id);
        if (update == 1) {
            System.out.println("Book: " + book.getTitle() + " was updated!");
        }
    }

    @Override
    public void delete(int id) {
        String sql = "delete from book where id = ?";
        int delete = jdbcTemplate.update(sql, id);
        if (delete == 0) {
            System.out.println("Book: " + id + " was deleted.");
        }
    }
}
