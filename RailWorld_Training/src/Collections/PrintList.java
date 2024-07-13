package Collections;

import java.util.ArrayList;
import java.util.Iterator;

/***
 * 1. *Basic Operations*
 *     - Write a Java program to create an ArrayList of integers.
 *     Add the numbers 1 through 10 to the list, then print the list.
 */
public class PrintList {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);

         Iterator itr = l.iterator();
         while(itr.hasNext()){
             System.out.println(itr.next());
         }
    }
}
