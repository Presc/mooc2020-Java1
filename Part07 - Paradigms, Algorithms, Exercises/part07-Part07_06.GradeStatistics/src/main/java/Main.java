
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grades grades = new Grades();
        System.out.println("Enter Point totals, -1 stops:");
        while (true) {
            String input = scanner.nextLine();
            int points = Integer.valueOf(input);
            
            if(points == -1) {
                break;
            }
            grades.add(points);                       
            
        }      
        
        
        System.out.println("Point average (all): " + grades.average());
        if (grades.averagePassing() != -2) {
            System.out.println("Point average (passing): " + grades.averagePassing());
        } else {
            System.out.println("Point average (passing): - ");
        }
        System.out.println("Pass percentage: " + grades.passingPercentage());
        System.out.println("Grade Distribution:");
        grades.gradeDistribution();
    }
}
