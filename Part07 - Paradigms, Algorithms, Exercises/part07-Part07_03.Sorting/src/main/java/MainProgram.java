
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array) {
        int smallest = 1000;
        for (int number: array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int min = array[index];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
                index = i;
            }
        }
        
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = 0;
        int min = table[startIndex];
        
        for(int i = startIndex; i < table.length; i++) {
            if (table[i] <= min) {
                min = table[i];
                index = i;
            }
        }
        
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2){ 
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        swap(array, 0, indexOfSmallest(array));
        for(int i = 1; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }

}
