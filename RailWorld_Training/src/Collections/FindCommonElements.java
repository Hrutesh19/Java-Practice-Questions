package Collections;


import java.util.HashSet;
import java.util.Set;

/***
 * 10. *Find Common Elements in Three Sets*
 *     - *Description*: Given three sets, write a function to find the common elements among all three sets.
 */
public class FindCommonElements {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(1);

        set2.add(1);
        set2.add(1);
        set2.add(3);
        set2.add(2);

        set3.add(1);
        set3.add(2);
        set3.add(3);
        set3.add(4);

        Set<Integer> commonEle = new HashSet<>(set1);
        commonEle.retainAll(set2);
        commonEle.retainAll(set3);

        System.out.println("Set1: "+set1);
        System.out.println("Set2: "+set2);
        System.out.println("Set3: "+set3);
        System.out.println("Common Elements of Three Sets are: "+commonEle);


    }
}
