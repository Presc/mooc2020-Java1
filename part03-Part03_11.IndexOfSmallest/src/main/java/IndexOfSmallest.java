
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 9999;
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (true) {
           int input = Integer.valueOf(scanner.nextLine());
           if (input == 9999) {
               break;
           }
           numbers.add(input);
        }
        
        for (int i = 0; i < numbers.size(); i++) {
            if (min > numbers.get(i)) {
                min = numbers.get(i);
            }        
        }
        System.out.println("Smallest number: " + min);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == min) {
                System.out.println("Found at index: " + i);
            }
        }
       
    }
}
