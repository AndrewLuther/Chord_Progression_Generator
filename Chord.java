import java.util.ArrayList;

public class Chord {
    private ArrayList<Note> notes;
    private ChordQuality quality;
    private Note root;

    Chord(Note root, ChordQuality quality){
        this.root = root;
        this.quality = quality;
        initializeNotes();
    }

    private void initializeNotes(){
        notes = new ArrayList<>();
        for(int interval: quality.getIntervals()){
            Note noteToAdd = Note.values()[(root.getNumber() + interval)%12]; // Add the note that is the number value of the root, plus the interval
            notes.add(noteToAdd);
        }
    }

    @Override
    public String toString() {
        return root.getName() + " " + quality.toString();
    }


    
}
