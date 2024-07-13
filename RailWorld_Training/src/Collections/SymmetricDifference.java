package Collections;

/**
 * 7. *Symmetric Difference of Two Sets*
 *     - *Description*: Write a function to find the symmetric difference of two sets
 *     (elements that are in either of the sets but not in their intersection).
 */
import java.util.HashSet;
import java.util.Set;
public class SymmetricDifference {

    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(3);
        set1.add(5);

        set2.add(1);
        set2.add(6);
        set2.add(7);

        Set<Integer> result = symmetricSetDifference(set1, set2);
        System.out.println(result);  // Output: [3, 5, 6, 7]
    }

    public static Set<Integer> symmetricSetDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> newSet = new HashSet<>(set1);
        Set<Integer> set2Copy = new HashSet<>(set2);

        newSet.removeAll(set2);
        set2Copy.removeAll(set1);

        newSet.addAll(set2Copy);
        return newSet;
    }
}
