/**
 *
 * @author Owen
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand milliseconds;
    public Timer() {
        this.seconds = new ClockHand(60);
        this.milliseconds = new ClockHand(100);
        
    }
    
    public void advance() {
        this.milliseconds.advance();
        
        if(this.milliseconds.value() == 0) {
            this.seconds.advance();
        }
    }
    
    public String toString() {
        return this.seconds + ":" + this.milliseconds;
    }
}
