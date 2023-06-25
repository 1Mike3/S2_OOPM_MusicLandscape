package MusicLandscape.entities;

import MusicLandscape.Date;
import MusicLandscape.Venue;

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

                public Event(Event E){
                    this.artist = E.artist;
                    this.attendees = E.attendees;
                    this.date = E.date;
                    this.description = E.description;
                    this.venue = E.venue;
                }

    //getters and setters


    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
                    if(artist != null) {
                        this.artist = artist;
                    }
    }

    public int getAttendees() {
        return attendees;
    }

    public void setAttendees(int attendees) {
                    if(attendees >= 0) {
                        this.attendees = attendees;
                    }

    }

    public Date getDate() {
                    if (date != null){
                        Date date1 = new Date(date);
                        return date1;
                    }else {
                        return null;
                    }
    }

    public void setDate(Date date) {
                    if(date != null) {
                        this.date = new Date(date);
                    }

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        if(description == null){
            this.description = "";
        }
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }


    public  int impact(){
        int impact = 0;
        if (attendees > 0){
            impact = attendees * 2;
        }
        return impact;
    }

    public String toString(){
                    String s = "";
                    if (artist != null){
                        s += artist.getName();
                    }else {
                        s += "unknown";
                    }

                    s += " @ ";

                    if (venue != null){
                        s += venue.getName();
                    }else {
                        s += "unknown";
                    }

                    s += " on ";

                    if (date != null){
                        s += date.toString();
                    }else {
                        s += "unknown";
                    }

                    s += "\n";

                    if (description != null) {
                        s += description;
                    }

                    s += "\n(" + attendees + " attending(" + impact() + "))";


                    return s;
    }


}
