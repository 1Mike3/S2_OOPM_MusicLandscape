package MusicLandscape.entities;

import MusicLandscape.Venue;
import MusicLandscape.Date;
import java.util.ArrayList;
import java.util.List;

public class Event {
    private String name;
    private Date date;
    private Venue venue;
    private List<Artist> acts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.equals("") && !name.trim().equals("")) {
            this.name = name;
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        if (date != null) {
            this.date = date;
        }
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        if (venue != null) {
            this.venue = venue;
        }
    }

    public List<Artist> getActs() {
        return acts;
    }

    public void setActs(List<Artist> acts) {
        if (acts != null) {
            this.acts = acts;
        }
    }

    public void addAct(Artist act) {
        if (act != null) {
            if (acts == null) {
                acts = new ArrayList<>();
            }
            acts.add(act);
        }
    }

    public void removeAct(Artist act) {
        if (act != null && acts != null) {
            acts.remove(act);
        }
    }

    public int numberOfActs() {
        if (acts != null) {
            return acts.size();
        } else {
            return 0;
        }
    }

    public int indexOfAct(Artist act) {
        if (act != null && acts != null) {
            return acts.indexOf(act);
        } else {
            return -1;
        }
    }

    public Artist getActAt(int index) {
        if (index >= 0 && acts != null && index < acts.size()) {
            return acts.get(index);
        } else {
            return null;
        }
    }

    public Artist getAct(String name) {
        if (name != null && acts != null) {
            for (Artist act : acts) {
                if (act.getName().equals(name)) {
                    return act;
                }
            }
        }
        return null;
    }

    public int totalTime() {
        int totalTime = 0;
        if (acts != null) {
            for (Artist act : acts) {
                totalTime += act.totalTime();
            }
        }
        return totalTime;
    }

    public int totalTime(String name) {
        int totalTime = 0;
        if (name != null && acts != null) {
            for (Artist act : acts) {
                if (act.getName().equals(name)) {
                    totalTime += act.totalTime();
                }
            }
        }
    }

}
