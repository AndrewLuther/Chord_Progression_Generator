import java.util.*;

public enum ChordQuality {

    MAJOR("Major", new ArrayList<Integer>(List.of(0,4,7))),
    MINOR("Minor", new ArrayList<Integer>(List.of(0,3,7))),
    DIMINISHED("Diminished", new ArrayList<Integer>(List.of(0,3,6)));

    private final String name;
    private final ArrayList<Integer> intervals;
    
    ChordQuality(String name, ArrayList<Integer> intervals){
        this.intervals = intervals;
        this.name = name;
    }

    public ArrayList<Integer> getIntervals(){
        return intervals;
    }

    @Override
    public String toString(){
        return name;
    }


}
