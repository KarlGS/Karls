/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.concerts.dao;

import com.swcguild.concerts.model.Artist;
import com.swcguild.concerts.model.Comments;
import com.swcguild.concerts.model.Event;
import com.swcguild.concerts.model.Venue;
import java.util.HashMap;

/**
 *
 * @author apprentice
 */
public class ConcertDaoDbImpl implements ConcertDao{
    private JdbcTemplate jdbcTemplate;

    @Override
    public Event getEvent(int eventId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Artist getArtist(int artistId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Venue getVenue(int venueId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HashMap<Integer, Comments> getComments(int venueId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HashMap<Integer, Artist> getAllArtists() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HashMap<Integer, Venue> getAllVenues() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
