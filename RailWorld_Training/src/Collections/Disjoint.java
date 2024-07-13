package Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 2. *Check if Two Sets are Disjoint*
 *     - *Description*: Write a function that checks if two sets are disjoint
 *     (i.e., they have no elements in common).
 *
 *     Note:  disjoint means "having no elements in common" when talking about sets.
 */


public class Disjoint {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();

        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);


        boolean isCommon = Collections.disjoint(set1,set2);
        System.out.println("Output: "+isCommon);
    }

}
