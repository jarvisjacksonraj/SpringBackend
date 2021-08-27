package dev.jarvis.jackson.BooksRestAPI.controller;

import dev.jarvis.jackson.BooksRestAPI.model.Book;
import dev.jarvis.jackson.BooksRestAPI.exception.BookAlreadyExistException;
import dev.jarvis.jackson.BooksRestAPI.exception.BookNotFoundException;
import dev.jarvis.jackson.BooksRestAPI.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> list() {
        return bookService.list();
    }

    @GetMapping("/{id}")
    public Book get(@PathVariable int id) throws BookNotFoundException {
        return bookService.get(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void create(@RequestBody Book book) throws BookAlreadyExistException {
        bookService.create(book);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@RequestBody Book book, @PathVariable int id) {
        bookService.update(book, id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        bookService.delete(id);
    }

}
