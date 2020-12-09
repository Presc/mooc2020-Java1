
import java.util.Scanner;

/**
 *
 * @author Owen
 */
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        for (;;) {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;   
            }                        
            
            if (input.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                
                dictionary.add(word, translation);
            } else if(input.equals("search")) {
                System.out.println("To be translated:");
                String search = scanner.nextLine();
                
                if(this.dictionary.translate(search) != null) {
                    System.out.println("Translation: " + this.dictionary.translate(search));
                } else {
                    System.out.println("Word " + search + " was not found");
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
    
}
