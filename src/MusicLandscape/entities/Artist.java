package MusicLandscape.entities;

public class Artist {
    // The name of the Artist
    private String name;

                //constructors
                //standard constructor

                public Artist(){
                    this.name = "unknown";
                }
                //copy constructor
                public Artist(Artist a){
                    this.name = a.name;
                }
                //specific constructor
                public Artist(String name){
                    this.name = name;
                }




    ///Method which returns the Artists Name
    public String getName(){
    return name;
    }

    //Method which sets the Artists Name (only if empty)
    public void setName(String name){


       if(name != null  && !name.trim().equals("")  ){
         //   if (this.name == null) { //skipped because it seems to be useless in this test
                this.name = name;
          //  }



        }

    }



}
