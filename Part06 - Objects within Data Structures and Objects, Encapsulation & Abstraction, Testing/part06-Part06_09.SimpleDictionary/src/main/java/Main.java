
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SimpleDictionary dictionary = new SimpleDictionary();
        Scanner scanner = new Scanner(System.in);
        TextUI test = new TextUI(scanner, dictionary);
        
        test.start();
        System.out.println(dictionary.translate("test"));
    }
}
