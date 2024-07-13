package Collections;

import java.util.*;

/**
 * 6. *Find All Pairs with a Given Sum in Two Sets*
 *    *Description*: Given two sets of integers and a target sum,
 *     write a function to find all pairs of elements (one from each set) that add up to the target sum.
 */
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class FindPairsWithGivenSum {
    public static List<int[]> findPairs(Set<Integer> set1, Set<Integer> set2, int targetSum) {
        List<int[]> result = new ArrayList<>();
        Set<Integer> set1Elements = new HashSet<>(set1);

        for (int num2 : set2) {
            int complement = targetSum - num2;
            if (set1Elements.contains(complement)) {
                result.add(new int[]{complement, num2});
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        int targetSum = 7;

        List<int[]> pairs = findPairs(set1, set2, targetSum);

        System.out.println("Pairs with sum " + targetSum + ":");
        for (int[] pair : pairs) {
            System.out.println("(" + pair[0] + ", " + pair[1] + ")");
        }
    }
}


