package Collections;

import java.util.Enumeration;
import java.util.Vector;


public class EnumerationDemo {

    public static void main(String[] args) {
        Vector v =  new Vector();

        v.add(10);
        v.add("Hrutesh");
        v.add("Aadesh");

        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }
}
