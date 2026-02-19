package com.BookList.Book;

import java.util.*;

public interface BookRepo {
    ArrayList<Book> getAllBooks();
public Book getBookById(int id);
public Book addBook(Book book);
}
