public enum Note {

    
    C("C", "C"),
    CSHARP("C#", "Db"),
    D("D", "D"),
    DSHARP("D#", "Eb"),
    E("E", "E"),
    F("F", "F"),
    FSHARP("F#", "Gb"),
    G("G", "G"),
    GSHARP("G#", "Ab"),
    A("A", "A"),
    ASHARP("A#", "Bb"),
    B("B", "B");

    private final String noteName;
    private final String altName;

    Note(String noteName, String altName){
        this.noteName = noteName;
        this.altName = altName;
    }

    public int getNumber(){
        return ordinal();
    }

    public String getName(){
        return noteName;
    }

    public String getAltName(){
        return altName;
    }

    @Override
    public String toString(){
        return noteName;
    }

}
