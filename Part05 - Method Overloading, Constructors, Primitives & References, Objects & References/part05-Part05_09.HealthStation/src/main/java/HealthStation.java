
public class HealthStation {
    private int countWeights;

    public int weigh(Person person) {
        countWeights++;
        return person.getWeight();        
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int weighings() {
        return countWeights;
    }
}
