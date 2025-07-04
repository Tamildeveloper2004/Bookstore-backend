package com.tamil.bookstore_backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tamil.bookstore_backend.Model.Book;
import com.tamil.bookstore_backend.Service.BookSrevice;



@RestController
public class BookController {
    @Autowired
    private BookSrevice BookSer;

    @GetMapping("Book")
    public List<Book> getallBooks(){
        return BookSer.getallBooks();
    }
    
    @PostMapping("Book")
    public String addBook(@RequestBody Book book){
        BookSer.addBook(book);
        return "added";
    }
    @PutMapping("Book")
    public String UpdateBook(@RequestBody Book book){
        BookSer.UpdateBook(book);
        return "updated";
    }
    @DeleteMapping("Book/{id}")
    public String DeleteBook(@PathVariable long id){
        BookSer.DeleteBook(id);
        return "deleted";
    }
    @GetMapping("Book/{id}")
    public void getBook(@PathVariable long id){
         BookSer.GetBook(id);
        
    }
    
}
