
import java.util.ArrayList;

/**
 *
 * @author Owen
 */
public class Recipe {
    private String name;
    private int time;
    ArrayList<String> ingredients;
    
    public Recipe(String name, int time, ArrayList<String> ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getCookingTime() {
        return this.time;
    }
    
    public boolean hasIngredient(String targetIngredient) {
        for(String ingredient: this.ingredients) {
            if(ingredient.equals(targetIngredient)) {
                return true;
            }
        }
        return false;
    }
    
    public String toString() {
        return this.name + ", cooking time: " + this.time;
    }
    
    
}
