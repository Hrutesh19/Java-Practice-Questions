package Collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

/***
 * 3. *Find Maximum*
 *     - Write a Java method to find the maximum value in an ArrayList of integers.
 */
/**
import java.util.Collections;

public class FindMaximum {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> list = new ArrayList<>();

        // Add integers to the list
        list.add(21);
        list.add(52);
        list.add(66);

        // Use Collections.max to find the maximum value
        int maximum = Collections.max(list);

        // Print the maximum value found
        System.out.println("The maximum value in the ArrayList of integers is: " + maximum);
    }
}
*/
import java.util.ArrayList;
import java.util.Scanner;

public class FindMaximum {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // Scanner for user input
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int numElements = s.nextInt();

        // Get the numbers from the user
        for (int i = 0; i < numElements; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            int number = s.nextInt();
            list.add(number);
        }

        // Initialize maximum with the first element of the list
        int maximum = list.get(0);

        // Iterate through the list to find the maximum value
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > maximum) {
                maximum = list.get(i);
            }
        }

        // Print the maximum value found
        System.out.println("The maximum value in the ArrayList of integers is: " + maximum);
    }
}
