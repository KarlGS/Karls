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
    private int id;
    private String venue;
    private String artist;
    final private static String DATE = new SimpleDateFormat("MMddyyyy").format(new Date());
    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
