
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();        
        
        ArrayList<String> names = new ArrayList<>();
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNext()) {
                names.add(fileReader.nextLine());
            }         
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        if (names.contains(searchedFor)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }

    }
}
