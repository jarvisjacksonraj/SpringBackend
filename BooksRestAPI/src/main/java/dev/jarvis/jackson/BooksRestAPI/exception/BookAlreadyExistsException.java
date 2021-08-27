package dev.jarvis.jackson.BooksRestAPI.exception;

import dev.jarvis.jackson.BooksRestAPI.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Book Already Exists")
public class BookAlreadyExistsException extends RuntimeException {

    public BookAlreadyExistsException(Book book) {
        super("Book already exists: " + book.toString());
    }
}