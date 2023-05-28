package MusicLandscape.entities;



public class Track {
    private String title;
    private int duration;
    private Artist writer;
    private Artist performer;
    private int year;

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
     localWriter = writer.getName();
}else{
     localWriter = "unknown";
}

        if(!localWriter.equals("unknown")){
            //limit the lockalWriter to 10 characters
            localWriter = this.writer.getName();
            if(localWriter.length() > 10){
                localWriter = localWriter.substring(0,10);
            }

        }


            localTitle = this.title;

if(localTitle != null && localTitle.length() >10){
    localTitle = localTitle.substring(0,10);
}else{
    localTitle = "unknown";
}

//limit the localPerformer to 10 characters
if(performer != null && performer.getName() != null){
    localPerformer = performer.getName();
}else{
    localPerformer = "unknown";
}
        if(localPerformer.length() > 10){
            localPerformer = localPerformer.substring(0,10);
        }



        seconds = (duration)%100;

        minutes = duration /60 ;


        return String.format("%10s by %10s performed by %10s (%02d:%02d)",localTitle, localWriter,localPerformer,minutes,seconds);
    }


    //CONSTRUCTOR
    public Track(){
this.performer = new Artist();
this.writer = new Artist();
performer.setName(null);
writer.setName(null);
this.title = null;
this.year = 0;
this.duration = 0;
    }

}
