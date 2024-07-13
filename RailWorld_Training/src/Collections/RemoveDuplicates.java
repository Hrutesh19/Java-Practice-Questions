package Collections;



/***
 * 1. *Remove Duplicates from an Array*
 *     - *Description*: Given an array of integers, remove duplicates and return the array with unique elements.
 */

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr =  {10, 20, 30, 40, 20, 10, 25};

        // Use a HashSet to remove duplicates
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        // Print the unique elements
        System.out.println(set);
    }
}
