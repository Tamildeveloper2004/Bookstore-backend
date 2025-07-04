package com.tamil.bookstore_backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class Book {
    @Id
private long id;
private String name;
private double price;
public Book() {
}
public Book(long id, String name, double price) {
    this.id = id;
    this.name = name;
    this.price = price;
}
}
