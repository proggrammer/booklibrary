package io.kdkr.booklibrary.service;

import io.kdkr.booklibrary.model.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BookService {
    public List<Book> getAllBooks() {
        Address addressAuthor1 = new Address("AuthorCity1");
        Author author1 = new Author("Author1", addressAuthor1);
        BookDescription bookDescription1 = new BookDescription("book1", "bookabout1", "","");
        Address addressPub1 = new Address("PublisherCity1");
        Publisher publisher1 = new Publisher("publisher1", addressPub1);
        Publication publication1 = new Publication("1999", publisher1);
        Book book1 = new Book("id1", bookDescription1, author1, publication1);

        Address addressAuthor2 = new Address("AuthorCity2");
        Author author2 = new Author("Author2", addressAuthor2);
        BookDescription bookDescription2 = new BookDescription("book2", "bookabout2", "","");
        Address addressPub2 = new Address("PublisherCity2");
        Publisher publisher2 = new Publisher("publisher2", addressPub2);
        Publication publication2 = new Publication("2000", publisher2);
        Book book2 = new Book("id2", bookDescription2, author2, publication2);

        Address addressAuthor3 = new Address("AuthorCity3");
        Author author3 = new Author("Author3", addressAuthor3);
        BookDescription bookDescription3 = new BookDescription("book3", "bookabout3", "","");
        Address addressPub3 = new Address("PublisherCity3");
        Publisher publisher3 = new Publisher("publisher3", addressPub3);
        Publication publication3 = new Publication("2001", publisher3);
        Book book3 = new Book("id3", bookDescription3, author3, publication3);
        return Arrays.asList(book1,book2,book3);
    }
}
