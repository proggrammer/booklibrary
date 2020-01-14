package io.kdkr.booklibrary.service;

import io.kdkr.booklibrary.model.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {
    Book book1 = new Book("id1", "name1");
    Book book2 = new Book("id2", "name2");
    Book book3 = new Book("id3", "name3");

    private List<Book> allBooks =  Arrays.asList(book1,book2,book3);

    public List<Book> getAllBooks() {
        return allBooks;
    }

    public Book getBook(String id)  {
         Book result = allBooks.stream().filter(x->x.getId().equals(id)).findFirst().orElse(null);
         if(result == null) return new Book("null", "null");
         return result;
    }

    public void addBook(Book book) {
        allBooks.add(book);
    }

    public void updateBook(String id, Book book) {
        allBooks = allBooks.stream().filter(bk -> !bk.getId().equals(id)).collect(Collectors.toList());
        allBooks.add(book);
    }

    public void deleteBook(String id) {
        allBooks = allBooks.stream().filter(bk -> !bk.getId().equals(id)).collect(Collectors.toList());
    }
}
