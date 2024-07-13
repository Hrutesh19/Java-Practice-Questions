package Collections;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

/***
 * 3. *Find the Intersection of Two Sets*
 *     - *Description*: Write a function that finds the intersection of two sets and returns a new set containing the common elements.
 */

public class IntersectionOfSet {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(4);
        set2.add(2);

        Set <Integer> intersection = new HashSet(set1);

        intersection.retainAll(set2);
        System.out.println("Set1: "+set1);
        System.out.println("Set2: "+set2);
        System.out.println("The Intersection set is: "+intersection);

    }
}
