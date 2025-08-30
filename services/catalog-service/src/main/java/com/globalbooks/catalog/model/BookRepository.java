package com.globalbooks.catalog.model;

import java.util.*;
import java.util.stream.Collectors;

public class BookRepository {
    
    private static final Map<String, Book> books = new HashMap<>();
    
    static {
        // Initialize with sample data
        books.put("book-001", new Book("book-001", "The Great Gatsby", "F. Scott Fitzgerald", 12.99, 50));
        books.put("book-002", new Book("book-002", "To Kill a Mockingbird", "Harper Lee", 14.99, 30));
        books.put("book-003", new Book("book-003", "1984", "George Orwell", 13.99, 25));
        books.put("book-004", new Book("book-004", "Pride and Prejudice", "Jane Austen", 11.99, 40));
        books.put("book-005", new Book("book-005", "The Catcher in the Rye", "J.D. Salinger", 13.49, 20));
    }
    
    public Book findById(String id) {
        return books.get(id);
    }
    
    public List<Book> searchByTitle(String query) {
        return books.values().stream()
                .filter(book -> book.getTitle().toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toList());
    }
    
    public List<Book> findAll() {
        return new ArrayList<>(books.values());
    }
    
    public boolean updateStock(String id, int newStock) {
        Book book = books.get(id);
        if (book != null) {
            book.setStock(newStock);
            return true;
        }
        return false;
    }
    
    public Book save(Book book) {
        books.put(book.getId(), book);
        return book;
    }
}