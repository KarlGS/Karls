/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.concerts.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author apprentice
 */
public class Event {
    private int eventId;
    private int venueId;
    private int artistId;
//    final private static String DATE = new SimpleDateFormat("MMddyyyy").format(new Date());
    private String time;
    private String date;

    public int getVenueId() {
        return venueId;
    }

    public int getArtistId() {
        return artistId;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int id) {
        this.eventId = id;
    }

  

    public void setVenueId(int venue) {
        this.venueId = venue;
    }



    public void setArtistId(int artist) {
        this.artistId = artist;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
