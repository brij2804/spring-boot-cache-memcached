package com.brijesh.cache.repository;

import com.brijesh.cache.beans.Book;

public interface BookRepository {
    Book getByIsbn(String isbn);
}
