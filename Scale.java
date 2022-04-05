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
        for(int interval: type.getIntervals()){
            Note noteToAdd = Note.values()[root.getNumber() + interval]; // Add the note that is the number value of the root, plus the interval
            notes.add(noteToAdd);
        }
    }


}
