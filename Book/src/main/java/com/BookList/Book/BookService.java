package com.BookList.Book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepo bookRepo;

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public Book getBookById(int id) {
        return bookRepo.findById(id).orElse(null);
    }

    public Book addBook(Book book) {
        return bookRepo.save(book);
    }

    public Book updateBook(int id, Book book) {
        book.setId(id);
        return bookRepo.save(book);
    }

    public void deleteBook(int id) {
        bookRepo.deleteById(id);
    }
}
