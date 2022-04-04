public enum Note {

    
    C("C", null),
    CSHARP("C#", "Db"),
    D("D", null),
    DSHARP("D#", "Eb"),
    E("E", null),
    F("F", null),
    FSHARP("F#", "Gb"),
    G("G", null),
    GSHARP("G#", "Ab"),
    A("A", null),
    ASHARP("A#", "Bb"),
    B("B", null);

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
