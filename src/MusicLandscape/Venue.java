package MusicLandscape;

public class Venue {
    private int capacity;
    private String name;

                            ///constructor
                            public Venue(String name, int capacity){
                                this.name = "unknown";
                                this.capacity = 0;
                            }

    //getter capacity
    public int getCapacity() {
        return capacity;
    }

    ///setter capacity
    public void setCapacity(int capacity) {
    if(capacity >= 0) {
        this.capacity = capacity;
    }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
