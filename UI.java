import java.util.Scanner;

public class UI {
    String inputStr;

    UI(){

    }

    public void run(){
        Scanner input = new Scanner(System.in);
        while(!inputStr.equals("exit")){
            System.out.println("Enter a Root: (use sharps, not flats)");
            String rootInput = input.nextLine();
            try {
                Note root = readNote(rootInput);
            }
            catch(Exception e) {
                System.out.println("Invalid Input!");
                continue;
            }
        }
    
    }

    private Note readNote(String noteInput) throws Exception{
        Note[] notes = Note.values();
        for(Note note: notes){
            if(note.getName().equals(noteInput) || note.getAltName().equals(noteInput));
            return note;
        }

        throw new Exception("Note not found");

    }
    
}
