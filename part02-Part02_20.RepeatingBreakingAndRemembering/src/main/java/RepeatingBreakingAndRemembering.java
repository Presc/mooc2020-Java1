
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        int count = 0;
        double average = 0.0;
        int even = 0;
        int odd = 0;
        
        System.out.println("Give numbers:");
        while (true) {
            
            number = Integer.valueOf(scanner.nextLine());
            
            if (number == -1) {
                break;
            } else if (number % 2 == 0) {
                even++;
            } else if (number % 2 == 1) {
                odd++;
            }  
            
            sum += number;
            count++;
        }
        average = (double)sum / count;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
