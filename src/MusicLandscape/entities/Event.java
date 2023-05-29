package MusicLandscape.entities;

import MusicLandscape.Venue;
import MusicLandscape.Date;
import java.util.ArrayList;
import java.util.List;

public class Event {
    //Attributes
    private Artist artist;
    private int attendees;
    private Date date;
    private String description;
    private Venue venue;

                //constructors
                public Event(){
                    this.artist = new Artist();
                    this.attendees = 0;
                    this.description = "";
                }

    //getters and setters


    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public int getAttendees() {
        return attendees;
    }

    public void setAttendees(int attendees) {
        this.attendees = attendees;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }



}
