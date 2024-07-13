package ExceptionHandling;


/**
 * ArrayIndexOutOfBoundsException Handling:
 * Write a Java program that declares an array of integers with a fixed size.
 * Implement exception handling to catch the ArrayIndexOutOfBoundsException that may occur if the program tries to access an element at an index beyond the array's bounds.
 * Provide a suitable error message for this scenario.
 */
public class ArrayIndexOutofBound {

    public static void main(String[] args) {

        try {
            int array[] = new int[]{10, 20, 30, 40, 50};

            // Attempting to access an element beyond the array's bounds
            int value = array[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an element beyond the array's bounds.");
        }
    }
}
