package ExceptionHandling;

/*

1. *NullPointerException Handling:*
   Write a Java program that creates an array of integers and tries to access an
   element at an index that is out of bounds.
   Implement exception handling to catch the NullPointerException
   that may occur and print a meaningful error message.

 */
public class NullPointerExceptionHandling {
    public static void main(String[] args) {
        try {
            int[] numbers = null; // Array set to null

            int index = 0; // Index is within bounds
            int element = numbers[index]; // This line will throw NullPointerException
            System.out.println("Element at index " + index + ": " + element);
        } catch (NullPointerException e) {
            System.out.println("Error: Array is null. Make sure to initialize the array before accessing its elements.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
