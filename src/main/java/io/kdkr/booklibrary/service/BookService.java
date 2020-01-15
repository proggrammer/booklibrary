package io.kdkr.booklibrary.service;

import io.kdkr.booklibrary.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {
    @Value("${name}")
    private String name;

//    @Autowired
//    private BookRepository bookRepository;

    @Autowired
    private BookMongoRepo bookRepository;

    Book book1 = new Book("id1", "name1");
    Book book2 = new Book("id2", "name2");
    Book book3 = new Book("id3", "name3");

    private List<Book> allBooks =  Arrays.asList(book1,book2,book3);

    public List<Book> getAllBooks() {
        List<Book> list = new ArrayList<>();
        bookRepository.findAll().forEach(list::add);
        return list;
    }

    public Book getBook(String id)  {
         Book result = bookRepository.findOne(id);
         return result;
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public void updateBook(String id, Book book) {
        bookRepository.save(book);
    }

    public void deleteBook(String id) {
        bookRepository.delete(id);
    }
}
