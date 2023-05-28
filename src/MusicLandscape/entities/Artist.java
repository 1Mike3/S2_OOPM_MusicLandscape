package MusicLandscape.entities;

public class Artist {
    // The name of the Artist
    private String name;

    ///Method which returns the Artists Name
    public String getName(){
    return name;
    }

    //Method which sets the Artists Name (only if empty)
    public void setName(String name){


       if(name != null   &&  !name.equals("") && !name.trim().equals("")  ){
            if (this.name == null) {
                this.name = name;
            }



        }

    }

    //CONSTRUCTOR
    public Artist(){
this.name = null;
    }


}
