/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.rsvpjsp.model;

/**
 *
 * @author apprentice
 */
public class Party {
    private String date;
    private String time;
    private String place;
    private String type;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
