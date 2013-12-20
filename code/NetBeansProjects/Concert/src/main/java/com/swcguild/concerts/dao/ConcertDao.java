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

/**
 *
 * @author apprentice
 */
public interface ConcertDao {
    public Event getEventById(int eventId);
    public List<Event> getEventByArtist(String artistName);
    public List<Event> getEventByVenue(String venueName);
    public Artist getArtistById(int artistId);
    public Venue getVenueById(int venueId);
    public Comments getVenueCommentsById(int commentId);
    public Event editEvent (Event editEvent);
    public Artist editArtist(Artist editArtist);
    public Venue editVenue(Venue editVenue);
    public Comments editComments(Comments editComment);
    public List<Comments> getCommentsById(int posterId);
    public List<Comments> getCommentsByPoster(String posterId);
    public List<Artist> getArtistsByGenre(String genreType);
    public List<Artist> getAllArtists();
    public List<Venue> getAllVenues();
    public List<Event> getAllEvents();
    public Artist addArtist(Artist newArtist);
    public Venue addVenue(Venue newVenue);
    public Event addEvent(Event newEvent);
    public void removeArtist(int artistId);
    public void removeVenue(int venueId);
    public void removeEvent(int eventId);
    public void removeVenueComments(int venueComments);
    public Comments addVenueComment(Comments newComment);
    public List<Comments> getCommentsOnVenue(int venueId);
    }
  
    

