/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.library.dao;

import com.swcguild.library.model.Author;
import com.swcguild.library.model.Book;
import com.swcguild.library.model.Publisher;

/**
 *
 * @author apprentice
 */
public interface LibraryDao {
    public Book addBook(Book newBook, Publisher id);
    
    public void removeBook(int bookId);
    
    public void updateBook(Book book)throws Exception;
    
    public Author addAuthor(Author newAuthor);
    
    public void removeAuthor(int authId);
    
    public void updateAuthor(Author author)throws Exception;
    
    public Publisher addPublisher(Publisher newPublisher);
    
    public void removePublisher(int pubId);
    
    public void updatePublisher(Author author)throws Exception;
    
    public Book getBook(int bookId);
    
    public Author getAuthor(int authId);
    
    public Publisher getPub(int pubId);
}
