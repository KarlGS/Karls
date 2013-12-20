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
    private int id;
    private String posterId;
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
