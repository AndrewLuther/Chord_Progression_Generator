import java.util.Random;
import java.util.random.*;

public class Progression {
    private int numberOfChords;
    private Scale scale;
    private Chord[] chords;
    private Chord[] possibleChords;

    Progression(int numberOfChords, Scale scale){
        this.numberOfChords = numberOfChords;
        this.scale = scale;
        chords = new Chord[numberOfChords];
        generatePossibleChords();
    }

    public void generatePossibleChords(){
        for(int i = 0; i<scale.getNumberOfNotes(); i++){
            Chord chord = new Chord(scale.getNote(i), determineChordQuality(i+1)); // Note that i is incremented by 1 so that scaleDegree starts at 1.
            chords[i] = chord;
        }
    }

    public Chord[] getProgression(){
        generateProgression();
        return chords;
    }

    private void generateProgression(){
        Random rand = new Random();
        for(int i = 0; i<numberOfChords; i++){
            if(i==0) chords[i] = possibleChords[0];
            else {
                int randInt = rand.nextInt(possibleChords.length);
                chords[i] = possibleChords[randInt];
            }
        }
    }

    private ChordQuality determineChordQuality(int scaleDegree){
        ScaleType type = scale.getScaleType();
        switch(type) {
            case MAJOR:
                if(scaleDegree == 1 || scaleDegree == 4 || scaleDegree == 5) return ChordQuality.MAJOR;
                else if(scaleDegree == 2 || scaleDegree == 3 || scaleDegree == 6) return ChordQuality.MINOR;
                else if(scaleDegree == 7) return ChordQuality.DIMINISHED;
            case MINOR:
                if(scaleDegree == 1 || scaleDegree == 4) return ChordQuality.MINOR;
                else if(scaleDegree == 3 || scaleDegree == 5 || scaleDegree == 6 || scaleDegree == 7) return ChordQuality.MAJOR;
                else if(scaleDegree == 2) return ChordQuality.DIMINISHED;
            default:
                return ChordQuality.MAJOR;
        }
    }
    
}
