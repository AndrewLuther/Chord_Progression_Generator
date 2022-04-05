import java.util.Scanner;

public class UI {
    String inputStr;

    UI(){
        inputStr = "";
    }

    public void run(){
        Scanner input = new Scanner(System.in);
        while(!inputStr.equals("exit")){
            System.out.println("Enter a Root:");
            String rootInput = input.nextLine();
            try {
                Note root = readNote(rootInput);
                //System.out.println(root.getName());
            }
            catch(Exception e) {
                System.out.println("Invalid Input!");
                inputStr = rootInput;
                continue;
            }
        }
    
    }

    private Note readNote(String noteInput) throws Exception{
        Note[] notes = Note.values();
        for(int i = 0; i<notes.length; i++){
            Note note = notes[i];
            if(note.getName().equals(noteInput) )  return note;
            else continue;
        }
        throw new Exception("Note not found");

    }
    
}
