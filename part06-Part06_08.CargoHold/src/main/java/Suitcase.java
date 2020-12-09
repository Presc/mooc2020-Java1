
import java.util.ArrayList;

/**
 *
 * @author Owen
 */
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    private int weight;
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.weight = 0;
    }
    
    public void addItem(Item item) {
        if (this.weight + item.getWeight() <= this.maxWeight) {
            this.weight += item.getWeight();
            this.items.add(item);
        }
    }
    
    public void printItems() {
        for (Item item: items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int sum = 0;
        for (Item item: items) {
            sum += item.getWeight();
        }
        return sum;
    }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item heaviest = items.get(0);
        
        for (Item item: items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
    
    public String toString() {
        if (this.items.size() == 0) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            return "1 item (" + this.weight + " kg)";
        } else {
            return this.items.size() + " items (" + this.weight + "kg)";
        }
        
        
    }
}
