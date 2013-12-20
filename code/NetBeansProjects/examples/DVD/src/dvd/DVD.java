/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dvd;

import java.util.ArrayList;

/**
 *
 * @author apprentice
 */
public class DVD {

    private String title;
    private String releaseDate;
    private String rating;
    private String director;
    private String studio;
    private String note;
    private ArrayList<String> notes = new ArrayList<String>();

    public ArrayList getNotes() {
        return notes;
    }

    public void setNotes(ArrayList newNote) {
        this.notes = newNote;

    }

    public void addNote(String newNote) {
        notes.add(newNote);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String[] getNote() {
        String[] notesArray;
        return note.split(";;");
    }

    public void setNote(String note) {
        this.note = note;
    }
}
