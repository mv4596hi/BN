import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class GroupPE6 {
    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        System.out.println("Enter file name: ");
        String fileName = input.nextLine();
        
        File file = new File(fileName + ".txt");
        
        if(!file.exists()) {
            System.out.println("The file " + fileName + ".txt does not exist.");
            System.exit(0);
        }
        
        Scanner fileInput = new Scanner(file);

        System.out.println("Enter a single character: ");
        String charInputString = input.nextLine();

        charInputString = charInputString.toLowerCase();
        char character = charInputString.charAt(0);
        
        String line; 
        
        int count = 0;
        
        while(fileInput.hasNext()) {
            line = fileInput.nextLine();
            line = line.toLowerCase();
            for(int i = 0; i <line.length(); i++) {
                if(line.charAt(i) == character) {
                            count ++;
                    }
            }
        }
        
        System.out.println("The character " + character + " shows in the file " + count + " times.");
        
                fileInput.close();
	}
}