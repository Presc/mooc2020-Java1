import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        for(;;) {
            System.out.println("Title: ");
            String title = in.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(in.nextLine());
            System.out.println("Publication year: ");
            int pubYear = Integer.valueOf(in.nextLine());
            
            books.add(new Book(title, pages, pubYear));
        }
        System.out.println("What information will be printed?");
        String input = in.nextLine();
        for (Book book: books) {
            if (input.equals("everything")) {
                System.out.println(book);
            } else if (input.equals("name")) {
                System.out.println(book.getTitle());
            }
        }  
    }
}
