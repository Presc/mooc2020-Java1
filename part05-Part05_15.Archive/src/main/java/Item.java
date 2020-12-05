/**
 *
 * @author Owen
 */
public class Item {
    private String name;
    private String identifier;
    
    public Item(String name, String id) {
        this.name = name;
        this.identifier = id;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }
    
    public boolean equals(Object compared) {
        Item comparedItem = (Item) compared;
        if(this.identifier.equals(comparedItem.identifier)){
            return true;
        }        
        return false;
    }
    
    public String toString() {
        return identifier + ": " + name;
    }
}
