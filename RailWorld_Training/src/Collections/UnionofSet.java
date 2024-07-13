package Collections;


/***
 * 4. *Union of Multiple Sets*
 *     - *Description*: Write a function that takes a list of sets and returns their union.
 */

import java.util.HashSet;
import java.util.Set;

public class UnionofSet {

    public static void main(String[] args) {
        // Creating first set
        Set<Integer> set1 = new HashSet<>();
        set1.add(20);
        set1.add(30);
        set1.add(40);

        // Creating second set
        Set<Integer> set2 = new HashSet<>();
        set2.add(50);
        set2.add(60);
        set2.add(40);

        // Performing the union of set1 and set2
        Set<Integer> answer = Sets.union(set1, set2);

        // Printing set1, set2, and the union of set1 and set2
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Set of Union: " + answer);
    }
}

// Utility class for set operations
class Sets {
    // Method to perform union of two sets of integers
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        // Create a new set and initialize it with the elements of set1
        Set<Integer> resultSet = new HashSet<>(set1);
        // Add all elements of set2 to resultSet
        resultSet.addAll(set2);
        // Return the union of set1 and set2
        return resultSet;
    }
}

