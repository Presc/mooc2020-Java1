
import java.util.ArrayList;

/**
 *
 * @author Owen
 */
public class Stack {
    
    private ArrayList<String> stack;
    
    public Stack () {
        this.stack = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
    
    public void add(String value) {
        this.stack.add(value);
    }
    
    public ArrayList<String> values() {               
        return stack;
    }
    
    public String take() {
        String s = this.stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return s;
    }
}
