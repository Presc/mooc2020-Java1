
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Owen
 */
public class UserInterface {
    private Scanner scanner;
    private ArrayList<Recipe> recipes;
    
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.recipes = new ArrayList<>();
    }
    
    public void start() {
        System.out.println("File to read: ");
        String input = scanner.nextLine();
        readFile(input);
        
        
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        for (;;) {
            System.out.println("");
            System.out.print("Enter command: ");
            input = scanner.nextLine();
            
            if(input.equals("stop")) {
                break;
            }
            
            if(input.equals("list")) {
                for (Recipe recipe: recipes) {
                    System.out.println(recipe);
                }
            }
            
            if(input.equals("find name")) {
                System.out.println("Searched word: ");
                input = scanner.nextLine();
                for(Recipe recipe: recipes) {
                    if (recipe.getName().contains(input)) {
                        System.out.println(recipe);
                    }
                }
            }
            
            if(input.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());
                for(Recipe recipe: recipes) {
                    if (recipe.getCookingTime() <= maxTime) {
                        System.out.println(recipe);
                    }
                }
            }
            
            if(input.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                input = scanner.nextLine();
                for(Recipe recipe: recipes) {
                    if(recipe.hasIngredient(input) == true) {
                        System.out.println(recipe);
                    }
                }
            }
            
        }
        
    }
    
    public void readFile(String fileName) {
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
           while (fileReader.hasNextLine()) {
               String line = fileReader.nextLine();
               
               if(line.equals("")) {
                   continue;
               }
               
               String recipeName = line;
               int recipeTime = Integer.valueOf(fileReader.nextLine());
               ArrayList<String> ingredients = new ArrayList<>();
               
               while (fileReader.hasNextLine()) {
                   String ingredient = fileReader.nextLine();
                   
                   if(ingredient.isEmpty()) {
                       break;
                   }
                   ingredients.add(ingredient);
               }
               recipes.add(new Recipe(recipeName, recipeTime, ingredients));
           }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
            
}
