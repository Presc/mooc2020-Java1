
import java.util.ArrayList;

/**
 *
 * @author Owen
 */
public class Hold {
    private int weight;
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
        
    public Hold(int maxWeight) {
        this.weight = 0;
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if(this.weight + suitcase.totalWeight() <= this.maxWeight) {
            this.weight += suitcase.totalWeight();
            this.suitcases.add(suitcase);
        }
    }
    
    public void printItems() {
        for(Suitcase suitcase: suitcases) {
            suitcase.printItems();
        }
    }
    
    public String toString() {
        if (this.suitcases.size() == 0) {
            return "no suitcases (0 kg)";
        } else if (this.suitcases.size() == 1) {
            return "1 suitcase (" + this.weight + " kg)";
        } else {
            return this.suitcases.size() + " suitcases (" + this.weight + "kg)";
        }
    }
}
