import java.util.*;

public class Scale {
    private Note root;
    private ScaleType type;
    private ArrayList<Note> notes;

    Scale(Note root, ScaleType type){
        this.root = root;
        this.type = type;
        initializeNotes();
    }


    private void initializeNotes(){
        notes = new ArrayList<>();
        for(int interval: type.getIntervals()){
            Note noteToAdd = Note.values()[(root.getNumber() + interval)%12]; // Add the note that is the number value of the root, plus the interval
            notes.add(noteToAdd);
        }
    }

    public Note getNote(int noteIndex){
        return notes.get(noteIndex);
    }

    public int getNumberOfNotes(){
        return notes.size();
    }

    public ScaleType getScaleType(){
        return type;
    }


}
