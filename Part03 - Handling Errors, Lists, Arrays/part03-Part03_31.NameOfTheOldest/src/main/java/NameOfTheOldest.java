
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int max = 0;
        String oldest = "";
        while (!input.isEmpty()) {
            String[] parts = input.split(",");
            if (max < Integer.valueOf(parts[1])) {
                max = Integer.valueOf(parts[1]);
                oldest = parts[0];
            }
            
            input = scanner.nextLine();            
        } 
        System.out.println("Name of the oldest: " + oldest);
    }
}
