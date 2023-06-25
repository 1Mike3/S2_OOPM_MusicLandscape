package MusicLandscape.entities;



public class Track {
    private String title;
    private int duration;
    private Artist writer;
    private Artist performer;
    private int year;


    //CONSTRUCTOR
    //default constructor
    public Track(){
        this.performer = new Artist();
        this.writer = new Artist();
        performer.setName("unknown");
        writer.setName("unknown");
        this.title = null;
        this.year = 1900;
        this.duration = 0;
    }
    //specific constructor
    public Track(String title){
this();
        this.title = title;
    }
    ///copy constructor
    public Track(Track t){
        this.title = t.title;
        this.duration = t.duration;
        this.writer = new Artist(t.writer);
        this.performer = new Artist(t.performer);
        this.year = t.year;
    }




//region Getters and Setters
    //DONE
    public String getTitle() {

        if(title == null || title.isEmpty() ){
            return "unknown title";
        }else {
            return title;
        }

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if(duration >= 0){
            this.duration = duration;
        }

    }

    public Artist getWriter() {
        return writer;
    }

//DONE
    public void setWriter(Artist writer) {
        if(writer != null){
            this.writer = writer;
        }

    }

    public Artist getPerformer() {
        return performer;
    }

    //DONE
    public void setPerformer(Artist performer) {
        if( performer != null){

            this.performer = performer;
        }
    }

    public int getYear() {
        return year;
    }

    //DONE
    public void setYear(int year) {
        if(year >= 1900 && year <= 2999) {
            this.year = year;
        }else {
            this.year = 0;
        }
    }

    //endregion Getters and Setters


    ///Method which returns if the Writer is known
    public boolean writerIsKnown(){
        if(writer != null && writer.getName() != null && !writer.getName().equals("unknown") && !writer.getName().equals("")){
            return true;
        }
        return false;
    }






                                                    public String getString(){
                                                        String localTitle;
                                                        String localWriter;
                                                        String localPerformer;
                                                        int minutes;
                                                        int seconds;

                                                if (writer != null && writer.getName() != null ){
                                                     localWriter = String.format("%10s",writer.getName()) ;
                                                }else{
                                                     localWriter = "unknown";
                                                }
                                                //account for a length larger than 10
                                                if(localWriter.length() > 10){
                                                    localWriter = localWriter.substring(0,10);
                                                }

                                                /*
                                                        if(!localWriter.equals("unknown")){
                                                            //limit the lockalWriter to 10 characters
                                                            localWriter = this.writer.getName();
                                                            if(localWriter.length() > 10){
                                                                localWriter = localWriter.substring(0,10);
                                                            }

                                                        }
                                                */

                                                            localTitle = this.title;
                                                if(localTitle != null ){
                                                    localTitle = String.format("%10s",title);
                                                }else{
                                                    localTitle = "unknown";
                                                }
                                                //account for a length larger than 10
                                                if(localTitle.length() > 10){
                                                    localTitle = localTitle.substring(0,10);
                                                }

                                                //limit the localPerformer to 10 characters
                                                if(performer != null && performer.getName() != null){
                                                    localPerformer = String.format("%10s",performer.getName());;
                                                }else{
                                                    localPerformer = "unknown";
                                                }
                                                        if(localPerformer.length() > 10){
                                                            localPerformer = localPerformer.substring(0,10);
                                                        }



                                                        seconds = (duration)%60;

                                                        minutes = duration /60 ;


                                                        return String.format("%10s by %10s performed by %10s (%02d:%02d)",localTitle, localWriter,localPerformer,minutes,seconds);
                                                    }





@Override
    public String toString(){
        return getString();
    }

}
