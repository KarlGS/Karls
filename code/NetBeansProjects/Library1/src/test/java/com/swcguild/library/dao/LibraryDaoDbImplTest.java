/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.library.dao;

import com.swcguild.library.model.Author;
import com.swcguild.library.model.Book;
import com.swcguild.library.model.Publisher;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author apprentice
 */
public class LibraryDaoDbImplTest {
   
    protected LibraryDao dao;
    public LibraryDaoDbImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("test-spring-persistence.xml");
        dao=(LibraryDao) ctx.getBean("LibraryDao");
        
        JdbcTemplate cleaner = (JdbcTemplate)ctx.getBean("jdbcTemplate");
        cleaner.execute("delete from books");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addBook method, of class LibraryDaoDbImpl.
     */
    @Test
    public void testAddBook() {
        Book newBook = new Book();
        newBook.setIsbn(884739);
        newBook.setTitle("Doug's Log");
        newBook.setPubId(3);
        newBook.setPrice(10.99f);
        Publisher newPub =new Publisher();
        newPub.setId(3);
        Book fromDb =dao.addBook(newBook, newPub);
    }

    /**
     * Test of removeBook method, of class LibraryDaoDbImpl.
     */
//    @Test
//    public void testRemoveBook() {
//        System.out.println("removeBook");
//        int bookId = 0;
//        LibraryDaoDbImpl instance = new LibraryDaoDbImpl();
//        instance.removeBook(bookId);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of updateBook method, of class LibraryDaoDbImpl.
//     */
//    @Test
//    public void testUpdateBook() throws Exception {
//        System.out.println("updateBook");
//        Book book = null;
//        LibraryDaoDbImpl instance = new LibraryDaoDbImpl();
//        instance.updateBook(book);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addAuthor method, of class LibraryDaoDbImpl.
//     */
//    @Test
//    public void testAddAuthor() {
//        System.out.println("addAuthor");
//        Author newAuthor = null;
//        LibraryDaoDbImpl instance = new LibraryDaoDbImpl();
//        Author expResult = null;
//        Author result = instance.addAuthor(newAuthor);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of removeAuthor method, of class LibraryDaoDbImpl.
//     */
//    @Test
//    public void testRemoveAuthor() {
//        System.out.println("removeAuthor");
//        int authId = 0;
//        LibraryDaoDbImpl instance = new LibraryDaoDbImpl();
//        instance.removeAuthor(authId);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of updateAuthor method, of class LibraryDaoDbImpl.
//     */
//    @Test
//    public void testUpdateAuthor() throws Exception {
//        System.out.println("updateAuthor");
//        Author author = null;
//        LibraryDaoDbImpl instance = new LibraryDaoDbImpl();
//        instance.updateAuthor(author);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addPublisher method, of class LibraryDaoDbImpl.
//     */
//    @Test
//    public void testAddPublisher() {
//        System.out.println("addPublisher");
//        Publisher newPublisher = null;
//        LibraryDaoDbImpl instance = new LibraryDaoDbImpl();
//        Publisher expResult = null;
//        Publisher result = instance.addPublisher(newPublisher);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of removePublisher method, of class LibraryDaoDbImpl.
//     */
//    @Test
//    public void testRemovePublisher() {
//        System.out.println("removePublisher");
//        int pubId = 0;
//        LibraryDaoDbImpl instance = new LibraryDaoDbImpl();
//        instance.removePublisher(pubId);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of updatePublisher method, of class LibraryDaoDbImpl.
//     */
//    @Test
//    public void testUpdatePublisher() throws Exception {
//        System.out.println("updatePublisher");
//        Author author = null;
//        LibraryDaoDbImpl instance = new LibraryDaoDbImpl();
//        instance.updatePublisher(author);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getBook method, of class LibraryDaoDbImpl.
//     */
//    @Test
//    public void testGetBook() {
//        System.out.println("getBook");
//        int bookId = 0;
//        LibraryDaoDbImpl instance = new LibraryDaoDbImpl();
//        Book expResult = null;
//        Book result = instance.getBook(bookId);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAuthor method, of class LibraryDaoDbImpl.
//     */
//    @Test
//    public void testGetAuthor() {
//        System.out.println("getAuthor");
//        int authId = 0;
//        LibraryDaoDbImpl instance = new LibraryDaoDbImpl();
//        Author expResult = null;
//        Author result = instance.getAuthor(authId);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPub method, of class LibraryDaoDbImpl.
//     */
//    @Test
//    public void testGetPub() {
//        System.out.println("getPub");
//        int pubId = 0;
//        LibraryDaoDbImpl instance = new LibraryDaoDbImpl();
//        Publisher expResult = null;
//        Publisher result = instance.getPub(pubId);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}