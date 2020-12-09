
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        for(;;) {
            System.out.println("First name: ");
            String name = scanner.nextLine();
            
            if (name.isEmpty()) {
                break;
            }
            
            System.out.println("Last name: ");
            String surname = scanner.nextLine();
            System.out.println("Identification number:");
            String idNum = scanner.nextLine();
            infoCollection.add(new PersonalInformation(name, surname, idNum));
        }
        for (PersonalInformation info: infoCollection) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }
        
    }
}
