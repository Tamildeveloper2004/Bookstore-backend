package com.tamil.bookstore_backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tamil.bookstore_backend.Model.Book;
import com.tamil.bookstore_backend.Repository.BookRepository;

@Service
public class BookSrevice {
    @Autowired
    private BookRepository BookRepo;
    public List<Book> getallBooks;
    public List<Book> getallBooks() {
        return BookRepo.findAll();
    }
    public Book addBook(Book book) {
        return BookRepo.save(book);
    }
    public Book UpdateBook(Book book) {
        return BookRepo.save(book);
    }
    public void DeleteBook(long id) {
         BookRepo.deleteById(id);
    }
    public void GetBook(Long id) {
        BookRepo.findById(id);
        
    }
    


}
