
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sumYears = 0;
        double avgYears = 0.0;
        int count = 0;
        int nameLength = 0;
        String longestName = "";
        
        
        while (!input.isEmpty()) {
            String[] parts = input.split(",");
            if (nameLength < parts[0].length()) {
                nameLength = parts[0].length();
                longestName = parts[0];
            }
            sumYears += Integer.valueOf(parts[1]);
            count++;            
            input = scanner.nextLine();            
        }
        avgYears = 1.0 * sumYears / count;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + avgYears);
    }
}
