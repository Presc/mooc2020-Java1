
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        while (!input.isEmpty()) {
            String[] parts = input.split(" ");
            for (String part : parts) {
                if (part.contains("av")) {
                    System.out.println(part);
                }
            }
            input = scanner.nextLine();
        }
    }
}
