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
                //System.out.println(root.getAltName());
            }
            catch(Exception e) {
                inputStr = rootInput;
                if(rootInput.equals("exit")) return;
                System.out.println("Invalid Input!");
                continue;
            }

            System.out.println("Enter a Scale:");
            String scaleInput = input.nextLine();
            try {
                ScaleType scale = readScale(scaleInput);
                //System.out.println(root.getAltName());
            }
            catch(Exception e) {
                inputStr = scaleInput;
                if(scaleInput.equals("exit")) return;
                System.out.println("Invalid Input!");
                continue;
            }


        }
    
    }

    private Note readNote(String noteInput) throws Exception{
        Note[] notes = Note.values();
        for(int i = 0; i<notes.length; i++){
            Note note = notes[i];
            //System.out.println("Checking " + note.getName());
            if(note.getName().equals(noteInput) || note.getAltName().equals(noteInput))  return note;
            else continue;
        }
        throw new Exception("Note not found");

    }

    private ScaleType readScale(String scaleInput) throws Exception{
        ScaleType[] scales = ScaleType.values();
        for(int i = 0; i<scales.length; i++){
            ScaleType scale = scales[i];
            //System.out.println("Checking " + note.getName());
            if(scale.getName().equals(scaleInput))  return scale;
            else continue;
        }
        throw new Exception("Scale not found");

    }
    
}
