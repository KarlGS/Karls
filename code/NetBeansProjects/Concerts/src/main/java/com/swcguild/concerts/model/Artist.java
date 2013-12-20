/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.concerts.model;

/**
 *
 * @author apprentice
 */
public class Artist {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    private String genre;
}
