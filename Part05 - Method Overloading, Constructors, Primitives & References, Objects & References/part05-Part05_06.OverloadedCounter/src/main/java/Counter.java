/**
 *
 * @author Owen
 */
public class Counter {
    private int count;
    
    public Counter() {
        this.count = 0;
    }
    
    public Counter(int startValue) {
        this.count = startValue;
    }
    
    public int value() {
        return count;
    }
    
    public void increase() {
        this.increase(1);
    }
    
    public void increase(int increaseBy) {
        if(increaseBy > 0) {
            count += increaseBy;
        }
    }
    
    public void decrease() {
        this.decrease(1);
    }
    
    public void decrease(int decreaseBy) {
        if(decreaseBy > 0) {
            count -= decreaseBy;
        }
    }
    
}
