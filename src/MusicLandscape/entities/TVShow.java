package MusicLandscape.entities;

public class TVShow extends Event{

    private String name;
    private int viewers;

                //Constructors
                public TVShow(){
                    super();
                    this.name = null;
                    this.viewers = 0;
                }

                public TVShow(Event e){
                    super(e);
                    this.name = null;
                    this.viewers = 0;
                }

                public TVShow(TVShow tvs){

                    super(tvs);
                    this.name = String.valueOf(tvs.name);
                    this.viewers = new Integer(tvs.viewers);
                }

    public void setViewers(int v){
        if(v >= 0 ){
            this.viewers = v;
        }
    }


    public String getName(){
        return name;
    }

    public int getViewers(){
        return viewers;
    }

    public void setName(String name) {
        if (name != null && !name.trim().equals("")) {
            this.name = name;
        }
    }

    @Override
    public int impact(){
        return (super.getAttendees() + viewers) * 2;
    }


        @Override

    public String toString(){
            String s = "";
            if (super.getArtist() != null){
                s += super.getArtist().getName();
            }else {
                s += "unknown";
            }

            s += " @ ";

            if (name != null){
                s += name;
            }else {
                s += "unknown";
            }

            s += " on ";

            if (super.getDate() != null){
                s += super.getDate().toString();
            }else {
                s += "unknown";
            }

            s += "\n";

            if (super.getDescription() != null) {
                s += super.getDescription();
            }

            s += "\n(" + (super.getAttendees()+viewers) + " attending (" + impact() + "))";


            return s;
    }


}//End Class
