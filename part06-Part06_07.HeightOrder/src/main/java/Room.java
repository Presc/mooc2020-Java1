
import java.util.ArrayList;

/**
 *
 * @author Owen
 */
public class Room {
    private ArrayList<Person> people;
    
    public Room() {
        this.people = new ArrayList<>();
    }
    
    public void add(Person person) {
       this.people.add(person);
    }
    
    public boolean isEmpty() {
        if (this.people.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        return this.people;
    }
    
    public Person shortest() {
        if (this.people.isEmpty()) {
            return null;
        }
        Person shortest = this.people.get(0);
        
        for (Person person: this.people) {
            if (shortest.getHeight() > person.getHeight()) {
                shortest = person;
            }
        }
        return shortest;        
    }
    
    public Person take() {
        if (this.people.isEmpty()) {
            return null;
        }
        Person takenPerson = this.shortest();
        this.people.remove(takenPerson);
        
        return takenPerson;                
    }
    
}
