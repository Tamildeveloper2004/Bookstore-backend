package com.tamil.bookstore_backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tamil.bookstore_backend.Model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
