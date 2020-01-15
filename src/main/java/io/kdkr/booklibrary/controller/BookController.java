package io.kdkr.booklibrary.controller;

import io.kdkr.booklibrary.model.*;
import io.kdkr.booklibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/books")
    public List<Book> getAllBooks()   {
        return bookService.getAllBooks();
    }


    //@Cacheable(value = "books", key = "#id", unless = "#result.followers < 12000")
    @Cacheable(value = "books", key = "#id")
    @RequestMapping("/books/{id}")
    public Book getBook(@PathVariable String id)   {
        return bookService.getBook(id);
    }

    @RequestMapping(method = RequestMethod.POST, value= "/books")
    public void addBook(@RequestBody Book book)  {
        bookService.addBook(book);
    }

    @CachePut(value = "books", key = "#book.id")
    @RequestMapping(method = RequestMethod.PUT, value= "/books/{id}")
    public void updateBook(@RequestBody Book book, @PathVariable String id)  {
        bookService.updateBook(id, book);
    }

    @CacheEvict(value = "books", allEntries=true)
    @RequestMapping(method = RequestMethod.DELETE, value= "/books/{id}")
    public void updateBook(@PathVariable String id)  {
        bookService.deleteBook(id);
    }
}
