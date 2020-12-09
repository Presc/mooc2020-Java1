
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        int sum = 0;
        double avg = 0.0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
            count++;
        }
        for (Integer number : list) {
            sum += number;
        }
        avg = 1.0 * sum / count;
        
        System.out.println("Average: " + avg);
    }
}
