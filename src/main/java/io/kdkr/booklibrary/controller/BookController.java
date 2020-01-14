package io.kdkr.booklibrary.controller;

import io.kdkr.booklibrary.model.*;
import io.kdkr.booklibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/books")
    public List<Book> getAllBooks()   {
        return bookService.getAllBooks();
    }
}
