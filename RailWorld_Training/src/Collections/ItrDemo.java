package Collections;

// This is Example of Iterator

import java.util.ArrayList;
import java.util.Iterator;

public class ItrDemo {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();

        l.add(101);
        l.add("Hrutesh");
        l.add("Aadesh");

       Iterator itr = l.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }
    }
}
