
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int max = 0;
        while (!input.isEmpty()) {
            String[] parts = input.split(",");
            max = Math.max(max, Integer.valueOf(parts[1]));
            
            input = scanner.nextLine();            
        } 
        System.out.println("Age of the oldest: " + max);
    }
}
