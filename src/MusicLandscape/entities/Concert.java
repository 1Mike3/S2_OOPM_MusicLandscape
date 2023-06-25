package MusicLandscape.entities;

public class Concert extends Event{
    private int nextIdx;

    private Track[] setList;

    public Concert(){
        super();
        setList = new Track[10];
        nextIdx = 0;
    }

    public boolean addTrack(Track t){
        if(t != null && nextIdx < setList.length){
            setList[nextIdx] = t;
            nextIdx++;
            return true;
        }
        return false;
    }

    private void ensureCapacity(int length){
        if(length > setList.length){
            Track[] newList = new Track[length];
            for(int i = 0; i < setList.length; i++){
                newList[i] = setList[i];
            }
            setList = newList;
        }
    }


public Track[] getSetList(){
        Track[] newList = new Track[nextIdx];
        for(int i = 0; i < nextIdx; i++){
            newList[i] = new Track(setList[i]); //setList[i];
        }
        return newList;
}

public void setSetList(Track[] tracks) {
    if (tracks != null) {
        ensureCapacity(tracks.length);
        int i = 0;
        for (int k = 0; k < tracks.length; k++, i++) {


                if(tracks[k] != null) {
                    setList[i] = new Track(tracks[k]);
                }else {
                    i--;
                }
        }
        nextIdx = tracks.length;
    }
}

    public void resetSetList(){
        setList = new Track[10];
        nextIdx = 0;
    }

    public int nrTracks(){
        return nextIdx;
    }

    public int duration(){
        int duration = 0;
        for(int i = 0; i < nextIdx; i++){
            duration += setList[i].getDuration();
        }
        return duration;
    }

    @Override
    public int impact(){
        int durationFactor = 1;
        int duration = duration();
        durationFactor += duration / 1800;

        int attendees = getAttendees();

        return durationFactor * attendees;
    }

    @Override
public String toString() {
        String s = super.toString();
       String noOfTracks = String.valueOf(nextIdx);
        String duration = String.format("%02d:%02d", duration() / (60 * 60), duration() / 300 );
        return s +"\n"+ noOfTracks +" tracks played, total duration " + duration + ".";

    }


}//ClassEnd
