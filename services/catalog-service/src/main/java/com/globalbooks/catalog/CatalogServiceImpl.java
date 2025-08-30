package com.globalbooks.catalog;

import com.globalbooks.catalog.model.Book;
import com.globalbooks.catalog.model.BookRepository;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "com.globalbooks.catalog.CatalogService")
public class CatalogServiceImpl implements CatalogService {
    
    private BookRepository bookRepository = new BookRepository();
    
    @Override
    public Book getBook(String id) {
        System.out.println("Getting book with ID: " + id);
        return bookRepository.findById(id);
    }
    
    @Override
    public Book[] searchBooks(String query) {
        System.out.println("Searching books with query: " + query);
        List<Book> books = bookRepository.searchByTitle(query);
        return books.toArray(new Book[0]);
    }
    
    @Override
    public boolean updateStock(String id, int quantity) {
        System.out.println("Updating stock for book " + id + " to " + quantity);
        return bookRepository.updateStock(id, quantity);
    }
}