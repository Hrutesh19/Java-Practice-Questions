package Collections;

/***
 * 2. *Remove Even Numbers*
 *     - Write a Java method to remove all even numbers from an ArrayList of integers.
 */


import java.util.ArrayList;
import java.util.Iterator;

public class RemoveEvenNum {

    public static void removeEvenNumbers(ArrayList<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println("Original list: " + numbers);

        removeEvenNumbers(numbers);

        System.out.println("List after removing even numbers: " + numbers);
    }
}

