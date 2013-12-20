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
public interface ConcertDao {
    public Event getEvent(int eventId);
    public Artist getArtist(int artistId);
    public Venue getVenue(int venueId);
    public HashMap<Integer,Comments> getComments(int venueId);
    public HashMap<Integer,Artist> getAllArtists();
    public HashMap<Integer,Venue> getAllVenues();

  
    
}
