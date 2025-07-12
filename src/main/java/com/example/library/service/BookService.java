
package com.example.library.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.library.model.Book;

@Service
public class BookService {

    private final Map<Integer, Book> bookCatalog = new HashMap<>();
    private int currentId = 1;

    public Book addBook(Book book) {
        if (book.getTitle() == null || book.getTitle().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        book.setId(currentId++);
        book.setAvailable(true);
        bookCatalog.put(book.getId(), book);
        return book;
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(bookCatalog.values());
    }

    public Book getBookById(int id) {
        return bookCatalog.get(id);
    }

    public boolean deleteBook(int id) {
        return bookCatalog.remove(id) != null;
    }

    public boolean updateAvailability(int id, boolean available) {
        Book book = bookCatalog.get(id);
        if (book != null) {
            book.setAvailable(available);
            return true;
        }
        return false;
    }
}
