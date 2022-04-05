import java.util.*;

public enum ScaleType {

    MAJOR("Major", new ArrayList<Integer>(List.of(0, 2, 4, 5, 7, 9, 11))),
    MINOR("Minor", new ArrayList<Integer>(List.of(0, 2, 3, 5, 7, 8, 10)));

    private final String name;
    private final ArrayList<Integer> intervals;

    ScaleType(String name, ArrayList<Integer> intervals){
        this.name = name;
        this.intervals = intervals;

    }

    public ArrayList<Integer> getIntervals(){
        return intervals;
    }

    public String getName(){
        return name;
    }
    
}
