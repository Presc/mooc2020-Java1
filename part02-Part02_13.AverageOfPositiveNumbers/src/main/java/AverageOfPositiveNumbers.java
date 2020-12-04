
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average = 0.0;
        int sum = 0;
        int count = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                break;
            } else if (input > 0) {
                sum += input;
                count++;
            }
        }
        if (count > 0) {        
            average = (double)sum/count;
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
