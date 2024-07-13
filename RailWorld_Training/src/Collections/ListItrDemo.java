package Collections;


import java.util.ArrayList;
import java.util.ListIterator;

public class ListItrDemo {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();

        l.add(101);
        l.add("Hrutesh");
        l .add("Aadesh");

        ListIterator li = l.listIterator();

        while(li.hasNext()){
            System.out.println(li.next());
        }

        System.out.println("_____________________");
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}
