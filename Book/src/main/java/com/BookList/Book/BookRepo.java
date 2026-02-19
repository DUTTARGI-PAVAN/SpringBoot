package com.BookList.Book;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Integer> {
    
public Book getBookById(int id);
public Book addBook(Book book);
}
