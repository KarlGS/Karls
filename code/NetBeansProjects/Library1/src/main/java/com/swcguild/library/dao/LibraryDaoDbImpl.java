/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.library.dao;

import com.swcguild.library.model.Author;
import com.swcguild.library.model.Book;
import com.swcguild.library.model.Publisher;
import javax.inject.Inject;
import org.springframework.jdbc.core.JdbcTemplate;



/**
 *
 * @author apprentice
 */
public class LibraryDaoDbImpl implements LibraryDao{
    private static final String SQL_INSERT_BOOK =
            "insert into books(isbn, title, pub_id, price) values(?,?,?,?)";
    private static final String SQL_INSERT_AUTHOR =
            "insert into authors(name, phone) values(?,?)";
    private static final String SQL_INSERT_PUBLISHER = 
            "insert into publishers(name, phone) values(?,?)";
    private static final String SQL_DELETE_BOOK = 
            "delete from books where book_id=?";
    private static final String SQL_DELETE_AUTHOR =
            "delete from authors where author_id=?";
    private static final String SQL_DELETE_PUBLISHER =
            "delete from publishers where pub_id=?";
    private static final String SQL_SELECT_BOOK = 
            "select * from books where book_id=?";
    private static final String SQL_SELECT_AUTHOR = 
            "select * from authors where author_id=?";
    private static final String SQL_SELECT_PUBLISHER =
            "select * from publishers where pub_id=?";
    private static final String SQL_UPDATE_BOOK =
            "update books set isbn =?, title=?, pub_id=?, price=?";
    private static final String SQL_UPDATE_AUTHOR =
            "update authors set author_name=?, author_phone";
    private static final String SQL_SELECT_ALL_BOOKS=
            "select * from books";
    private static final String SQL_SELECT_ALL_AUTHORS=
            "select * from authors";
    private JdbcTemplate jdbcTemplate;
    
    @Inject
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate= jdbcTemplate;
    }
            

    @Override
    public Book addBook(Book newBook, Publisher id) {
        jdbcTemplate.update(SQL_INSERT_BOOK, newBook.getIsbn(), newBook.getTitle(),id.getId(),newBook.getPrice());
        newBook.setId(jdbcTemplate.queryForInt("select LAST_INSERT_ID()"));
        return newBook;
    }

    @Override
    public void removeBook(int bookId) {
        jdbcTemplate.update(SQL_DELETE_BOOK,bookId);
    }

    @Override
    public void updateBook(Book book) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Author addAuthor(Author newAuthor) {
        jdbcTemplate.update(SQL_INSERT_AUTHOR, newAuthor.getName(),newAuthor.getPhone());
        newAuthor.setId(jdbcTemplate.queryForInt("select LAST_INSERT_ID()"));
        return newAuthor;
    }

    @Override
    public void removeAuthor(int authId) {
        jdbcTemplate.update(SQL_DELETE_AUTHOR, authId);
    }

    @Override
    public void updateAuthor(Author author) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Publisher addPublisher(Publisher newPublisher) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removePublisher(int pubId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updatePublisher(Author author) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Book getBook(int bookId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Author getAuthor(int authId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Publisher getPub(int pubId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
}
   