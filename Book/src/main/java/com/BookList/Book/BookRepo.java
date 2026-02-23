package com.BookList.Book;


import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Integer> {
    
}

public interface BookRepo extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
