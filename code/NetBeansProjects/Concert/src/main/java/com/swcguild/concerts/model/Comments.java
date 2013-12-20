/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.concerts.model;

/**
 *
 * @author apprentice
 */
public class Comments {
    private String posterId;
    private String content;
    private int venueCommentId;
    private int venueId;

    public int getVenueCommentId() {
        return venueCommentId;
    }

    public void setVenueCommentId(int venueCommentId) {
        this.venueCommentId = venueCommentId;
    }

    public int getVenueId() {
        return venueId;
    }

    public void setVenueId(int venueId) {
        this.venueId = venueId;
    }
   


    public String getPosterId() {
        return posterId;
    }

    public void setPosterId(String posterId) {
        this.posterId = posterId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
