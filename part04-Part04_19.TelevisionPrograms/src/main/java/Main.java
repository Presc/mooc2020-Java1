import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        
        for (;;) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            
            if (name.isEmpty()) {
                break;
            }
            
            System.out.println("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(name, duration));
                      
        }
        
        System.out.println("Program's maximum duration?");
        max = Integer.valueOf(scanner.nextLine());
        
        for(TelevisionProgram program: programs) {
            if (program.getDuration() <= max) {
                System.out.println(program);
            }
        }
        
        
    }
}
