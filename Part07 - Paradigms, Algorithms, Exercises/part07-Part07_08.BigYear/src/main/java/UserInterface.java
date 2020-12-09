import java.util.ArrayList;
import java.util.Scanner;

/*
 *
 * @author Owen
 */
public class UserInterface {
    private Scanner scanner;
    ArrayList<Bird> birds;
    
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birds = new ArrayList<>();
    }
    
    public void start() {
        for(;;) {
            System.out.print("? ");
            String input = scanner.nextLine();
            
            if (input.equals("Quit")) {
                break;
            }
            
            if(input.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();
                this.add(name, latinName);                
            }
            
            if(input.equals("Observation")) {
                System.out.println("Bird? ");
                String observed = scanner.nextLine();
                boolean found = false;
                for (Bird bird: birds) {
                    if(bird.getName().contains(observed)) {
                        bird.observed();
                        found = true;
                    } 
                }
                if(found == false) {
                    System.out.println("Not a bird!");
                }
            }
            
            if(input.equals("All")) {
                for(Bird bird: birds) {
                    System.out.println(bird);
                }
            }
            
            if(input.equals("One")) {
                System.out.println("Bird? ");
                String oneBird = scanner.nextLine();
                boolean oneBirdFound = false;
                for(Bird bird: birds) {
                    if(bird.getName().contains(oneBird)) {
                        System.out.println(bird);
                        oneBirdFound = true;
                    }                        
                }
                if(oneBirdFound == false) {
                    System.out.println("Not a bird!");
                }
            }
        }        
    }
    
    public void add(String name, String latinName) {
        this.birds.add(new Bird(name, latinName));
    }       
    
}
