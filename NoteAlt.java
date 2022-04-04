public enum NoteAlt {

    CFLAT("Cb", 11),
    C("C", 0),
    CSHARP("C#", 1),
    DFLAT("Db", 1),
    D("D", 2),
    DSHARP("D#", 3),
    EFLAT("Eb", 3),
    E("E", 4),
    ESHARP("E#", 5),
    FFLAT("Fb", 4),
    F("F", 5),
    FSHARP("F#", 6),
    GFLAT("Gb", 6),
    G("G", 7),
    GSHARP("G#", 8),
    AFLAT("Ab", 8),
    A("A", 9),
    ASHARP("A#", 10),
    BFLAT("Bb", 10),
    B("B", 11),
    BSHARP("B#", 0);

    private final String noteName;
    private final int noteNumber;

    NoteAlt(String noteName, int noteNumber){
        this.noteName = noteName;
        this.noteNumber = noteNumber;
    }

    public int getNumber(){
        return noteNumber;
    }

    public String getName(){
        return noteName;
    }

    @Override
    public String toString(){
        return noteName;
    }

}
