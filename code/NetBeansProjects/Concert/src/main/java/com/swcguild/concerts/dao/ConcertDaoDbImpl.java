/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.concerts.dao;

import com.swcguild.concerts.model.Artist;
import com.swcguild.concerts.model.Comments;
import com.swcguild.concerts.model.Event;
import com.swcguild.concerts.model.Venue;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import javax.xml.stream.events.Comment;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

/**
 *
 * @author apprentice
 */
public class ConcertDaoDbImpl implements ConcertDao{
    private JdbcTemplate jdbcTemplate;
    private static final String SQL_SELECT_EVENT=
            "select * from events where event_id =?";
    private static final String SQL_SELECT_EVENTS_BY_ARTIST=
            "select * from events where artists_id=?";
    private static final String SQL_SELECT_EVENTS_BY_VENUE=
            "select * from events where venue_id=?";
    private static final String SQL_SELECT_ARTIST=
            "select * from artists where artists_id=?";
    private static final String SQL_SELECT_VENUE=
            "select * from venues where venue_id=?";
    private static final String SQL_SELECT_VENUE_COMMENTS=
            "SELECT * FROM venue_comments WHERE venue_comment_id=?";          
    private static final String SQL_SELECT_ALL_EVENTS=
            "select * from events";
    private static final String SQL_SELECT_ALL_VENUES=
            "select * from venues";
    private static final String SQL_SELECT_ALL_ARTISTS=
            "select * from artists";
    private static final String SQL_SELECT_COMMENTS_ON_VENUE=
            "select * from venue_comments where venue_id = ?";
    private static final String SQL_SELECT_COMMENTS_BY_POSTER=
            "select * from venue_comments where poster_id=?";
    private static final String SQL_INSERT_ARTIST=
            "insert into artists(artists_id, name, genre) values (?,?,?)";
    private static final String SQL_INSERT_VENUE=
            "insert into venues(venue, city) values (?,?)";
    private static final String SQL_INSERT_EVENT=
            "insert into events (venue_id, artist_id, date, time) values (?,?,?,?)";
    private static final String SQL_INSERT_VENUE_COMMENT=
            "insert into venue_comments (venue_id, poster_id, content) values (?,?,?)";
    private static final String SQL_REMOVE_ARTIST=
            "delete from artists where artists_id=?";
    private static final String SQL_REMOVE_VENUE=
            "delete from venues where venue_id=?";
    private static final String SQL_REMOVE_EVENT=
            "delete from events where event_id=?";
    private static final String SQL_REMOVE_VENUE_COMMENT=
            "delete from venue_comments where venue_comment_id=?";
    private static final String SQL_UPDATE_ARTIST=
            "update artists set name=?, genre=? where artists_id =?";
    private static final String SQL_UPDATE_VENUE=
            "update venues set  venue =? , city =? where venue_id = ?";
    private static final String SQL_UPDATE_EVENT=
            "update events set venue_id=?, artist_id =?, date =?, time =? where event_id = ?";
    private static final String SQL_UPDATE_VENUE_COMMENT=
            "update venue_comments set venue_id=?, poster_id=?, content=? where venue_comment_id =?";

            
         
    
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }
    @Override
    public Event getEventById(int eventId) {
        try{
        return jdbcTemplate.queryForObject(SQL_SELECT_EVENT,
                new ParameterizedRowMapper<Event>() {
            public Event mapRow(ResultSet rs, int rownum) throws SQLException {
                Event event = new Event();
                event.setEventId(rs.getInt("event_id"));
                event.setVenueId(rs.getInt("venue_id"));
                event.setArtistId(rs.getInt("artist_id"));
                event.setTime(rs.getString("time"));
                event.setDate(rs.getString("date"));
                return event;
            }
        }, eventId);
        } catch(EmptyResultDataAccessException ex){
            // there were no results for the given contact id - we just want to return 
            //null in this case. 
            return null;
        }        
    }

    @Override
    public Artist getArtistById(int artistId) {
        try{
        return jdbcTemplate.queryForObject(SQL_SELECT_ARTIST,
                new ParameterizedRowMapper<Artist>() {
            public Artist mapRow(ResultSet rs, int rownum) throws SQLException {
                Artist artist = new Artist();
                artist.setArtistId(rs.getInt("artists_id"));
                artist.setName(rs.getString("name"));
                artist.setGenre(rs.getString("genre"));
                return artist;
            }
        }, artistId);
        } catch(EmptyResultDataAccessException ex){
            // there were no results for the given contact id - we just want to return 
            //null in this case. 
            return null;
        }   
    }

    @Override
    public Venue getVenueById(int venueId) {
        try{
        return jdbcTemplate.queryForObject(SQL_SELECT_VENUE,
                new ParameterizedRowMapper<Venue>() {
            public Venue mapRow(ResultSet rs, int rownum) throws SQLException {
                Venue venue = new Venue();
                venue.setId(rs.getInt("venue_id"));
                venue.setName(rs.getString("venue"));
                venue.setCity(rs.getString("city"));
                return venue;
            }
        }, venueId);
        } catch(EmptyResultDataAccessException ex){
            // there were no results for the given contact id - we just want to return 
            //null in this case. 
            return null;
        }           
    }

    @Override
    public List<Comments> getCommentsById(int commentId) {
        try{
        return jdbcTemplate.query(SQL_SELECT_COMMENTS_ON_VENUE,
                new ParameterizedRowMapper<Comments>() {
            public Comments mapRow(ResultSet rs, int rownum) throws SQLException {
                Comments comments = new Comments();
                comments.setVenueCommentId(rs.getInt("venue_comment_id"));
                comments.setVenueId(rs.getInt("venue_id"));
                comments.setPosterId(rs.getString("poster_id"));
                comments.setContent(rs.getString("content"));
                return comments;
            }
        }, commentId);
        } catch(EmptyResultDataAccessException ex){
            // there were no results for the given contact id - we just want to return 
            //null in this case. 
            return null;
        }   
    }

    @Override
    public List<Artist> getArtistsByGenre(String genreType) {
        try{
        return jdbcTemplate.query(SQL_SELECT_ARTIST,
                new ParameterizedRowMapper<Artist>() {
            public Artist mapRow(ResultSet rs, int rownum) throws SQLException {
                Artist artist = new Artist();
                artist.setArtistId(rs.getInt("artists_id"));
                artist.setName(rs.getString("name"));
                artist.setGenre(rs.getString("genre"));
                return artist;
            }
        }, genreType);
        } catch(EmptyResultDataAccessException ex){
            // there were no results for the given contact id - we just want to return 
            //null in this case. 
            return null;
        }
    }

    @Override
    public List<Artist> getAllArtists() {
        List<Artist> aList = jdbcTemplate.query(SQL_SELECT_ALL_ARTISTS,
                new ParameterizedRowMapper<Artist>(){
           public Artist mapRow(ResultSet rs, int rownum) throws SQLException {
               Artist artist = new Artist();
               artist.setArtistId(rs.getInt("artists_id"));
               artist.setName(rs.getString("name"));
               artist.setGenre(rs.getString("genre"));
               return artist;
           }
      });
      return aList;
    }

    @Override
    public List<Venue> getAllVenues() {
        List<Venue> vList = jdbcTemplate.query(SQL_SELECT_ALL_VENUES, new ParameterizedRowMapper<Venue>(){
           public Venue mapRow(ResultSet rs, int rownum) throws SQLException {
               Venue venue = new Venue();
               venue.setId(rs.getInt("venue_id"));
               venue.setName(rs.getString("venue"));
               venue.setCity(rs.getString("city"));
               return venue;
           }
      });
      return vList;        
    }
   @Override
   public List<Event> getAllEvents(){
       List<Event> eList = jdbcTemplate.query(SQL_SELECT_ALL_EVENTS,
               new ParameterizedRowMapper<Event>(){
          public Event mapRow(ResultSet rs, int rownum) throws SQLException {
               Event event = new Event();
               event.setEventId(rs.getInt("event_id"));
               event.setVenueId(rs.getInt("venue_id"));
               event.setArtistId(rs.getInt("artist_id"));
               event.setDate(rs.getString("date"));
               return event;
          }
   });
       return eList;
   }

    @Override
    public Artist addArtist(Artist newArtist) {
        jdbcTemplate.update(SQL_INSERT_ARTIST, newArtist.getArtistId(),newArtist.getName(),newArtist.getGenre());
        newArtist.setArtistId(jdbcTemplate.queryForInt("select LAST_INSERT_ID()"));
        return newArtist;
    }

    @Override
    public Venue addVenue(Venue newVenue) {
        jdbcTemplate.update(SQL_INSERT_VENUE, newVenue.getName(),newVenue.getCity());
        newVenue.setId(jdbcTemplate.queryForInt("select LAST_INSERT_ID()"));
        return newVenue;
    }

    @Override
    public Event addEvent(Event newEvent) {
        jdbcTemplate.update(SQL_INSERT_EVENT, newEvent.getVenueId(),newEvent.getArtistId(),newEvent.getDate(),newEvent.getTime());
        newEvent.setEventId(jdbcTemplate.queryForInt("select LAST_INSERT_ID()"));
        return newEvent;
    }

    @Override
    public void removeArtist(int artistId) {
        jdbcTemplate.update(SQL_REMOVE_ARTIST, artistId);
    }

    @Override
    public void removeVenue(int venueId) {
        jdbcTemplate.update(SQL_REMOVE_VENUE, venueId);
    }

    @Override
    public void removeEvent(int eventId) {
        jdbcTemplate.update(SQL_REMOVE_EVENT, eventId);
    }

    @Override
    public void removeVenueComments(int venueComments) {
        jdbcTemplate.update(SQL_REMOVE_VENUE_COMMENT, venueComments);
    }

    @Override
    public Comments addVenueComment(Comments newComment) {
        jdbcTemplate.update(SQL_INSERT_VENUE_COMMENT, newComment.getVenueId(), newComment.getPosterId(), newComment.getContent());
        newComment.setVenueCommentId(jdbcTemplate.queryForInt("select LAST_INSERT_ID()"));
        return newComment;
    }

    @Override
    public List<Comments> getCommentsByPoster(String posterId) {
        try{
        return jdbcTemplate.query(SQL_SELECT_COMMENTS_BY_POSTER,
                new ParameterizedRowMapper<Comments>(){
            public Comments mapRow(ResultSet rs, int rownum) throws SQLException {
                Comments comments = new Comments();
                comments.setVenueCommentId(rs.getInt("venue_comment_id"));
                comments.setVenueId(rs.getInt("venue_id"));
                comments.setPosterId(rs.getString("poster_id"));
                comments.setContent(rs.getString("content"));
                return comments;
            }
        }, posterId);
        } catch (EmptyResultDataAccessException ex){
        return null;
}
    }
    
//        public List<Comments> getCommentsById(int commentId) {
//        try{
//        return jdbcTemplate.query(SQL_SELECT_COMMENTS_ON_VENUE,
//                new ParameterizedRowMapper<Comments>() {
//            public Comments mapRow(ResultSet rs, int rownum) throws SQLException {
//                Comments comments = new Comments();
//                comments.setVenueCommentId(rs.getInt("venue_comment_id"));
//                comments.setVenueId(rs.getInt("venue_id"));
//                comments.setPosterId(rs.getString("poster_id"));
//                comments.setContent(rs.getString("content"));
//                return comments;
//            }
//        }, commentId);
//        } catch(EmptyResultDataAccessException ex){
//            // there were no results for the given contact id - we just want to return 
//            //null in this case. 
//            return null;
//        }   
//    }

    @Override
    public Event editEvent(Event editEvent) {
        jdbcTemplate.update(SQL_UPDATE_EVENT, editEvent.getVenueId(), editEvent.getArtistId(),editEvent.getDate(), editEvent.getTime(),editEvent.getEventId());
        return editEvent;
    }

    @Override
    public Artist editArtist(Artist editArtist) {
        jdbcTemplate.update(SQL_UPDATE_ARTIST, editArtist.getName(), editArtist.getGenre(), editArtist.getArtistId());
        return editArtist;
    }

    @Override
    public Venue editVenue(Venue editVenue) {
        jdbcTemplate.update(SQL_UPDATE_VENUE, editVenue.getName(), editVenue.getCity(), editVenue.getId());
        return editVenue;
       
    }

    @Override
    public Comments editComments(Comments editComments) {
        jdbcTemplate.update(SQL_UPDATE_VENUE_COMMENT, editComments.getVenueId(), editComments.getPosterId(), editComments.getContent(), editComments.getVenueCommentId());
        return editComments;
    }

    @Override
    public Comments getVenueCommentsById(int commentId) {
        try{
        return jdbcTemplate.queryForObject(SQL_SELECT_VENUE_COMMENTS,
                new ParameterizedRowMapper<Comments>() {
            public Comments mapRow(ResultSet rs, int rownum) throws SQLException {
                Comments comment = new Comments();
                comment.setVenueCommentId(rs.getInt("venue_comment_id"));
                comment.setVenueId(rs.getInt("venue_id"));
                comment.setPosterId(rs.getString("poster_id"));
                comment.setContent(rs.getString("content"));
                return comment;
            }
        }, commentId);
        } catch(EmptyResultDataAccessException ex){
            // there were no results for the given contact id - we just want to return 
            //null in this case. 
            return null;
        }           
    }

//    public List<Comments> getCommentsByPoster(String posterId) {
//        try{
//        return jdbcTemplate.query(SQL_SELECT_COMMENTS_BY_POSTER,
//                new ParameterizedRowMapper<Comments>(){
//            public Comments mapRow(ResultSet rs, int rownum) throws SQLException {
//                Comments comments = new Comments();
//                comments.setVenueCommentId(rs.getInt("venue_comment_id"));
//                comments.setVenueId(rs.getInt("venue_id"));
//                comments.setPosterId(rs.getString("poster_id"));
//                comments.setContent(rs.getString("content"));
//                return comments;
//            }
//        }, posterId);
//        } catch (EmptyResultDataAccessException ex){
//        return null;
//}
//      "select * from venue_comments inner join venues on venue_comments.venue_comment_id where venues.venue_id =?";

    @Override
    public List<Comments> getCommentsOnVenue(int venueId) {
        try{
        return jdbcTemplate.query(SQL_SELECT_COMMENTS_ON_VENUE,
                new ParameterizedRowMapper<Comments>() {
            public Comments mapRow(ResultSet rs, int rownum) throws SQLException {
                Comments comment = new Comments();
                comment.setVenueCommentId(rs.getInt("venue_comment_id"));
                comment.setVenueId(rs.getInt("venue_id"));
                comment.setPosterId(rs.getString("poster_id"));
                comment.setContent(rs.getString("content"));
                return comment;
            }
        }, venueId);
        } catch(EmptyResultDataAccessException ex){
            // there were no results for the given contact id - we just want to return 
            //null in this case. 
            return null;
        }    
    }


//        @Override
//    public Event getEventById(int eventId) {
//        try{
//        return jdbcTemplate.queryForObject(SQL_SELECT_EVENTS_BY_ARTIST,
//                new ParameterizedRowMapper<Event>() {
//            public Event mapRow(ResultSet rs, int rownum) throws SQLException {
//                Event event = new Event();
//                event.setEventId(rs.getInt("event_id"));
//                event.setVenueId(rs.getInt("venue_id"));
//                event.setArtistId(rs.getInt("artist_id"));
//                event.setTime(rs.getString("time"));
//                event.setDate(rs.getString("date"));
//                return event;
//            }
//        }, eventId);
//        } catch(EmptyResultDataAccessException ex){
//            // there were no results for the given contact id - we just want to return 
//            //null in this case. 
//            return null;
//        }        
//    }

    @Override
    public List<Event> getEventByVenue(String venueName) {
        try{
        return jdbcTemplate.query(SQL_SELECT_EVENTS_BY_VENUE,
                new ParameterizedRowMapper<Event>() {
            public Event mapRow(ResultSet rs, int rownum) throws SQLException {
                Event event = new Event();
                event.setEventId(rs.getInt("event_id"));
                event.setVenueId(rs.getInt("venue_id"));
                event.setArtistId(rs.getInt("artist_id"));
                event.setTime(rs.getString("time"));
                event.setDate(rs.getString("date"));
                return event;
            }
        }, venueName);
        } catch(EmptyResultDataAccessException ex){
            // there were no results for the given contact id - we just want to return 
            //null in this case. 
            return null;
        }    
    }

    @Override
    public List<Event> getEventByArtist(String artistName) {
        try{
        return jdbcTemplate.query(SQL_SELECT_EVENTS_BY_ARTIST,
                new ParameterizedRowMapper<Event>() {
            public Event mapRow(ResultSet rs, int rownum) throws SQLException {
                Event event = new Event();
                event.setEventId(rs.getInt("event_id"));
                event.setVenueId(rs.getInt("venue_id"));
                event.setArtistId(rs.getInt("artist_id"));
                event.setTime(rs.getString("time"));
                event.setDate(rs.getString("date"));
                return event;
            }
        }, artistName);
        } catch(EmptyResultDataAccessException ex){
            // there were no results for the given contact id - we just want to return 
            //null in this case. 
            return null;
        }    
    }
}
