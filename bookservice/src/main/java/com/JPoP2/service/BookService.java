package com.JPoP2.service;

import java.util.List;

public interface BookService {
    public Book addBook(Book book);

    public List<Book> getAllBooks();

    public Book getBookById(Long id);

    public Long deleteBookById(Long id);

    public Book updateBookById(Long id, Book book);
}
