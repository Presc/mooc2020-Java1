
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            } else {
                count++;
            }              
            int number = Integer.valueOf(input);   
            System.out.println(number * number * number);
        }             
        // System.out.println(count);

    }
}
