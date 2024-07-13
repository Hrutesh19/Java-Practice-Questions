package Collections;

import java.util.HashSet;
import java.util.Set;

/**
 * 5. *Check Subset Relationship*
 *     - *Description*: Write a function that checks if one set is a subse of another set.
 *     Note: every item in the first set can be found in the second set.
 */
public class SubsetChecker {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();

        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        boolean isSubset = set1.containsAll(set2);
        System.out.println(isSubset);



    }
}
