
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Owen
 */
public class JokeManager {
    
    private ArrayList<String> jokes;
    
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        this.jokes.add(joke);
    }
    
    public String drawJoke() {
        int index = 0;
        String joke = "";
        
        if(!(jokes.isEmpty())) {
            Random draw = new Random();
            index = draw.nextInt(jokes.size());
            joke = this.jokes.get(index);
        } else {
            joke = "Jokes are in short supply.";
        }
        return joke;
    }
    
    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
