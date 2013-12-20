/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.concerts.dao;

import com.swcguild.concerts.model.Artist;
import com.swcguild.concerts.model.Comments;
import com.swcguild.concerts.model.Event;
import com.swcguild.concerts.model.Venue;
import java.util.List;
import javax.xml.stream.events.Comment;
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
public class ConcertDaoDbImplTest {
    protected ConcertDao dao;
    Event newEvent = new Event();
    Artist newArtist = new Artist();
    Venue newVenue = new Venue();
    Comments newComment = new Comments();
    public ConcertDaoDbImplTest() {
        
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
        dao = (ConcertDao) ctx.getBean("concertDao");
        JdbcTemplate cleaner = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        cleaner.execute("delete from venue_comments");        
        cleaner.execute("delete from events");
        cleaner.execute("delete from artists");
        cleaner.execute("delete from venues");

        

        newArtist.setName("Aerosmith");
        newArtist.setGenre("Rock");
        dao.addArtist(newArtist);

        newVenue.setName("Intersection");
        newVenue.setCity("Grand Rapids");
        dao.addVenue(newVenue);
        newComment.setVenueId(newVenue.getId());
        newComment.setPosterId("haha");
        newComment.setContent("Awesome a55 place!!");
        dao.addVenueComment(newComment);  
        newEvent.setVenueId(newVenue.getId());
        newEvent.setArtistId(newArtist.getArtistId());
        newEvent.setDate("12122013");
        newEvent.setTime("7:30");
        dao.addEvent(newEvent);        
    }
    
    @After
    public void tearDown() {
        
    }

    /**
     * Test of getEventById method, of class ConcertDaoDbImpl.
     */

//    @Test
//    public void testGetCommentsById() {
//        System.out.println("getCommentsById");
//        int commentsId = 0;
//        ConcertDaoDbImpl instance = new ConcertDaoDbImpl();
//        List expResult = null;
//        List result = instance.getCommentsById(commentsId);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getArtistsByGenre method, of class ConcertDaoDbImpl.
//     */
//    @Test
//    public void testGetArtistsByGenre() {
//        System.out.println("getArtistsByGenre");
//        String genreType = "";
//        ConcertDaoDbImpl instance = new ConcertDaoDbImpl();
//        List expResult = null;
//        List result = instance.getArtistsByGenre(genreType);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAllArtists method, of class ConcertDaoDbImpl.
//     */
    
    @Test
    public void testGetAllArtists() {
        Artist newArtist = new Artist();
        newArtist.setName("Dizzee Rascal");
        newArtist.setGenre("Hip-hop");
        dao.addArtist(newArtist);
        Artist newArtist2 = new Artist();
        newArtist2.setName("Bob Wills");
        newArtist2.setGenre("Country Swing");
        dao.addArtist(newArtist2);
        Artist newArtist3= new Artist();
        newArtist3.setName("ABBA");
        newArtist3.setGenre("shit");
        dao.addArtist(newArtist3);
        List<Artist> cResult= dao.getAllArtists();
        assertEquals(newArtist2.getGenre(),cResult.get(2).getGenre());
    }

//    /**
//     * Test of getAllVenues method, of class ConcertDaoDbImpl.
//     */
    @Test
    public void testGetAllVenues() {
        System.out.println("getAllVenues");
        Venue newVenue = new Venue();
        newVenue.setName("Palace");
        newVenue.setCity("Auburn Hill");
        dao.addVenue(newVenue); 
        Venue newVenue2 = new Venue();
        newVenue2.setName("8ball");
        newVenue2.setCity("Saginaw");
        dao.addVenue(newVenue2);
        Venue newVenue3 = new Venue();
        newVenue3.setName("Dow Event Center");
        newVenue3.setCity("Saginaw");
        dao.addVenue(newVenue3);
        List<Venue> cResult = dao.getAllVenues();
        assertEquals(newVenue2.getName(),cResult.get(2).getName());
      
        
    }
//
//    /**
//     * Test of getAllEvents method, of class ConcertDaoDbImpl.
//     */
    @Test
    public void testGetAllEvents() {
        Event newEvent = new Event();
        newEvent.setVenueId(newVenue.getId());
        newEvent.setArtistId(newArtist.getArtistId());
        newEvent.setDate("12092013");
        newEvent.setTime("8:00");
        dao.addEvent(newEvent);
        Event newEvent2 = new Event();
        newEvent2.setVenueId(newVenue.getId());
        newEvent2.setArtistId(newArtist.getArtistId());
        newEvent2.setDate("12232013");
        newEvent2.setTime("8:35");
        dao.addEvent(newEvent2);
        Event newEvent3 = new Event();
        newEvent3.setVenueId(newVenue.getId());
        newEvent3.setArtistId(newArtist.getArtistId());
        newEvent3.setDate("12122013");
        newEvent3.setTime("9:00");
        dao.addEvent(newEvent3);
        List<Event> eList =dao.getAllEvents();
        assertEquals(eList.size(),4);
//        assertEquals(newEvent3.getDate(),eList.get(2).getDate());
//        assertEquals(newEvent2.getDate(),eList.get(1).getDate());
    }
   

    /**
     * Test of addArtist method, of class ConcertDaoDbImpl.
     */
    @Test
    public void testAddArtist() {
        Artist newArtist = new Artist();
        newArtist.setName("Aerosmith");
        newArtist.setGenre("Rock");
        dao.addArtist(newArtist);
        Artist cResult = dao.getArtistById(newArtist.getArtistId());
        assertEquals(newArtist.getArtistId(),cResult.getArtistId());
        assertEquals(newArtist.getName(), cResult.getName());
        assertEquals(newArtist.getGenre(),cResult.getGenre());
    }

    /**
     * Test of addVenue method, of class ConcertDaoDbImpl.
     */
    @Test
    public void testAddVenue() {
        Venue newVenue = new Venue();
        newVenue.setName("Intersection");
        newVenue.setCity("Grand Rapids");
        dao.addVenue(newVenue);
        Venue cResult = dao.getVenueById(newVenue.getId());
        assertEquals(newVenue.getName(), cResult.getName());
        assertEquals(newVenue.getCity(), cResult.getCity());
        
    }
//
//    /**
//     * Test of addEvent method, of class ConcertDaoDbImpl.
//     */
    @Test
    public void testAddEvent() {
        System.out.println("addEvent");
        Event newEvent= new Event();
        newEvent.setVenueId(newVenue.getId());
        newEvent.setArtistId(newArtist.getArtistId());
        newEvent.setDate("12122013");
        newEvent.setTime("7:30");
        dao.addEvent(newEvent);
        Event cResult = dao.getEventById(newEvent.getEventId());
        assertEquals(newEvent.getEventId(),cResult.getEventId());
        assertEquals(newEvent.getVenueId(),cResult.getVenueId());
        assertEquals(newEvent.getArtistId(),cResult.getArtistId());
        assertEquals(newEvent.getDate(),cResult.getDate());
        assertEquals(newEvent.getTime(),cResult.getTime());  
    }
//
//    /**
//     * Test of removeArtist method, of class ConcertDaoDbImpl.
//     */
    @Test
    public void testRemoveArtist() {
        System.out.println("removeArtist");
        Artist newArtist = new Artist();
        newArtist.setName("ACDC");
        newArtist.setGenre("Rock");
        dao.addArtist(newArtist);
        dao.removeArtist(newArtist.getArtistId());
        assertNull(dao.getArtistById(newArtist.getArtistId()));
    }
//
//    /**
//     * Test of removeVenue method, of class ConcertDaoDbImpl.
//     */
    @Test
    public void testRemoveVenue() {
        System.out.println("removeArtist");
        Venue newVenue = new Venue();
        newVenue.setName("Palace");
        newVenue.setCity("Auburn Hills");
        dao.addVenue(newVenue);
        dao.removeVenue(newVenue.getId());
        assertNull(dao.getVenueById(newVenue.getId()));
    }

//    /**
//     * Test of removeEvent method, of class ConcertDaoDbImpl.
//     */
    @Test
    public void testRemoveEvent() {
        System.out.println("removeEvent");
        Event newEvent = new Event();
        newEvent.setVenueId(newVenue.getId());
        newEvent.setArtistId(newArtist.getArtistId());
        newEvent.setDate("12302013");
        newEvent.setTime("8:00");
        dao.addEvent(newEvent);
        dao.removeEvent(newEvent.getEventId());
        assertNull(dao.getEventById(newEvent.getEventId()));
    }
//
//    /**
//     * Test of removeVenueComments method, of class ConcertDaoDbImpl.
//     */
    @Test
    public void testRemoveVenueComments() {
        System.out.println("removeVenueComments");
        Comments newComment = new Comments();
        newComment.setVenueId(newVenue.getId());
        newComment.setPosterId("asfsd");
        newComment.setContent("fasdfds");
        dao.addVenueComment(newComment);
        dao.removeVenueComments(newComment.getVenueCommentId());
        assertNull(dao.getVenueCommentsById(newComment.getVenueCommentId()));
    }
//
//    /**
//     * Test of addVenueComment method, of class ConcertDaoDbImpl.
//     */
    @Test
    public void testAddVenueComment() {
        System.out.println("addVenueComment");
        Comments newComment = new Comments();
        newComment.setVenueId(newVenue.getId());
        newComment.setPosterId("haha");
        newComment.setContent("Awesome a55 place!!");
        dao.addVenueComment(newComment);
        Comments cComment = dao.getVenueCommentsById(newComment.getVenueCommentId());
        assertEquals(newComment.getVenueId(),cComment.getVenueId());
        assertEquals(newComment.getPosterId(), cComment.getPosterId());
        assertEquals(newComment.getContent(), cComment.getContent());
//        Comments newComment2 = new Comments();
//        newComment2.setVenueId(3);
//        newComment2.setPosterId("asdfads");
//        newComment2.setContent("shitty venue");
//        dao.addVenueComment(newComment2);
//        Comments newComment3 = new Comments();
//        newComment3.setVenueId(4);
//        newComment3.setPosterId("haha");
//        newComment3.setContent("I take that back.. it was amazing!!");
//        dao.addVenueComment(newComment3);
//        List<Comments> posterComments =dao.getCommentsByPoster(newComment3.getPosterId());
//        assertEquals(3,posterComments.size());
//        assertEquals(newComment2.getVenueId(),posterComments.get(1).getVenueId());
//        assertEquals(newComment.getPosterId(), posterComments.get(0).getPosterId());
                
        
    }
    @Test 
    public void testEditArtist(){
        Artist newArtist = new Artist();
        newArtist.setName("Phil Collins");
        newArtist.setGenre("drum breaks");
        newArtist=dao.addArtist(newArtist);
        
        Artist fromDB= dao.getArtistById(newArtist.getArtistId());
        fromDB.setName("buckethead");
        fromDB.setGenre("Rock");
        dao.editArtist(fromDB);
        Artist check = dao.getArtistById(fromDB.getArtistId());
        assertEquals(fromDB.getArtistId(),check.getArtistId());
        assertEquals(fromDB.getName(), check.getName());
        assertEquals(fromDB.getGenre(), check.getGenre());
    }
    
    @Test
    public void testEditVenue(){
        Venue newVenue= new Venue();
        newVenue.setName("James Hall");
        newVenue.setCity("Saginaw Twp");
        newVenue=dao.addVenue(newVenue);
        
        Venue fromDB = dao.getVenueById(newVenue.getId());
        fromDB.setName("Morley");
        fromDB.setCity("clio");
        dao.editVenue(fromDB);
        Venue check = dao.getVenueById(fromDB.getId());
        assertEquals(fromDB.getName(), check.getName());
        assertEquals(fromDB.getCity(),check.getCity());
    }
    
    @Test
    public void testEditEvent(){
        Event newEvent = new Event();
        newEvent.setVenueId(newVenue.getId());
        newEvent.setArtistId(newArtist.getArtistId());
        newEvent.setDate("12232013");
        newEvent.setTime("8:00");
        dao.addEvent(newEvent);
        Event fromDB = dao.getEventById(newEvent.getEventId());
        fromDB.setArtistId(newArtist.getArtistId());
        fromDB.setVenueId(newVenue.getId());
        fromDB.setDate("12222014");
        fromDB.setTime("3:00");
        dao.editEvent(fromDB);
        Event check = dao.getEventById(fromDB.getEventId());
        assertEquals(fromDB.getEventId(),check.getEventId());
        assertEquals(fromDB.getArtistId(), check.getArtistId());
        assertEquals(fromDB.getVenueId(), check.getVenueId());
        assertEquals(fromDB.getDate(), check.getDate());
        assertEquals(fromDB.getTime(), check.getTime());
                
    }
    
    @Test
    public void testGetCommentsByVenue(){
        Venue newVenue= new Venue();
        newVenue.setName("James Hall");
        newVenue.setCity("Saginaw Twp");
        dao.addVenue(newVenue);
        Venue newVenue2= new Venue();
        newVenue2.setName("VanAndel");
        newVenue2.setCity("GR");
        dao.addVenue(newVenue2);
        Comments newComments1 = new Comments();
        newComments1.setVenueId(newVenue2.getId());
        newComments1.setPosterId("Phil");
        newComments1.setContent("Not a bad spot in the house");
        dao.addVenueComment(newComments1);
        Comments another = new Comments();
        another.setVenueId(newVenue2.getId());
        another.setPosterId("Mike");
        another.setContent("good luck with parking");
        dao.addVenueComment(another);
        List<Comments> check = dao.getCommentsOnVenue(newVenue2.getId());
        assertEquals(2,check.size());
        
        
    }
//    @Test
//    public void testAddArtist() {
//        Artist newArtist = new Artist();
//        newArtist.setName("Aerosmith");
//        newArtist.setGenre("Rock");
//        dao.addArtist(newArtist);
//        Artist cResult = dao.getArtistById(newArtist.getArtistId());
//        assertEquals(newArtist.getArtistId(),cResult.getArtistId());
//        assertEquals(newArtist.getName(), cResult.getName());
//        assertEquals(newArtist.getGenre(),cResult.getGenre());
//    }
}
