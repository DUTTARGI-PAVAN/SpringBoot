package com.BookList.Book;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;


import org.springframework.web.bind.annotation.PathVariable;

public class BookService implements BookRepo {
    private HashMap<Integer, Book> bookMap = new HashMap<>();

    public BookService(){
        Book b1=new Book(1,"Book1","book1.jpg");
        Book b2=new Book(2,"Book2","book2.jpg");
        bookMap.put(1, b1);
        bookMap.put(2, b2);
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        Collection<Book> values = bookMap.values();
        ArrayList<Book> bookList = new ArrayList<>(values);
        return bookList;
    }
    @Override
    public Book getBookById(@PathVariable("id") int id) {
        return bookMap.get(id);
        
    }
    
@Override
public Book addBook(Book book) {
    bookMap.put(book.getId(), book);
    return book;
}

public Book updateBook(int id, Book book) {
    bookMap.put(id, book);
    return book;
}
public void deleteBook(int id) {
    bookMap.remove(id);
}



}
