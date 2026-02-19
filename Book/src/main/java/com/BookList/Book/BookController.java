package com.BookList.Book;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    BookService bookService = new BookService();

    @GetMapping("/books")
    public ArrayList<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable("id") int id){
        return bookService.getBookById(id);
    }
    @PostMapping("/add-books")
public Book addBook(@RequestBody Book book) {
    return bookService.addBook(book);
}
    @PutMapping("/update-book/{id}")
public Book updateBook(@PathVariable int id, @RequestBody Book book) {
    return bookService.updateBook(id, book);
}
@DeleteMapping("/delete-book/{id}")
public String deleteBook(@PathVariable int id) {
    bookService.deleteBook(id);
    return "Book deleted successfully";
}


}
