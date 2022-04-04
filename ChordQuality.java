import java.util.*;

public enum ChordQuality {

    MAJOR("Major", new ArrayList<Integer>(List.of(0,4,7))),
    MINOR("Minor", new ArrayList<Integer>(List.of(0,3,7)));

    private final ArrayList<Integer> intervals;
    
    ChordQuality(String name, ArrayList<Integer> intervals){
        this.intervals = intervals;
    }

    public ArrayList<Integer> getIntervals(){
        return intervals;
    }


}
