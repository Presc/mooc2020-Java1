
import java.util.ArrayList;

/**
 *
 * @author Owen
 */
public class Grades {
    private ArrayList<Integer> grades;
    private int passing;
    public Grades() {
        this.grades = new ArrayList<>();
        this.passing = 0;
    }
    
    public void add(int points) {
        if (points >= 0 && points <= 100) {
            this.grades.add(points);
        }
    }
    
    public double average() {
        int sum = 0;
        if(grades.isEmpty()) {
            return -1;
        }
        for(Integer grade: grades) {
            sum += grade;
        }
        double average = 1.0 * sum / grades.size();
        return average;
    }
    
    public double averagePassing() {
        int sum = 0;
        passing = 0;
        if(grades.isEmpty()) {
            return -1;
        }
        for(Integer grade: grades) {
            if(grade >= 50) {
                sum += grade;
                passing++;
            }
        }
        if (passing == 0) {
            return -2;
        }
        double average = 1.0 * sum / passing;
        return average;
    }
    
    public double passingPercentage() {
        return 100.0 * passing / grades.size();
    }
    
    public void gradeDistribution() {
        String grade0, grade1, grade2, grade3, grade4, grade5;
        grade0 = grade1 = grade2 = grade3 = grade4 = grade5 = "";
        for(int i = 0; i < grades.size(); i++) {
            if(grades.get(i) >= 90) {
                grade5 += "*";
            } else if(grades.get(i) >= 80) {
                grade4 += "*";
            } else if(grades.get(i) >= 70) {
                grade3 += "*";
            } else if(grades.get(i) >= 60) {
                grade2 += "*";
            } else if(grades.get(i) >= 50) {
                grade1 += "*";
            } else {
                grade0 += "*";
            }            
        }
        System.out.println("5:" + grade5);
        System.out.println("4:" + grade4);
        System.out.println("3:" + grade3);
        System.out.println("2:" + grade2);
        System.out.println("1:" + grade1);
        System.out.println("0:" + grade0);
        
    }
}
