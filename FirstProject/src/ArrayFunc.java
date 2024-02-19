//print in reverse
//print every alternate number from array
//print all even numbers from 0 to 100

//code
public class ArrayFunc {
    
    public static void main(String[] args) {
        // Sample code provided
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] array3 = {1, 2, 3, 4, 5};
                
        String[] words = {"Hello", "World"}; //string array
        
        // Reversed string array
        System.out.println("Reversed String Array:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }
        
        // Print every alternate number from array
        System.out.println("Every alternate number from array3:");
        for (int i = 0; i < array3.length; i += 2) {
            System.out.println(array3[i]);
        }
        
        // Print all even numbers from 0 to 100
        System.out.println("Even numbers from 0 to 100:");
        for (int i = 0; i <= 100; i ++) {
        	if (i%2==0) {
            System.out.println(i);
        	}
        }
        
     // Print largest number from array
        System.out.println("Largest number from array3");
        int largest = array3[0];
        for (int i = 1; i < array3.length; i++) {
            if (array3[i] > largest) {
                largest = array3[i];
            }
        }
        System.out.println(largest);
    }
}
