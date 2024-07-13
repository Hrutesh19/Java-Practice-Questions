package Constructors;

//Example of Default Constructor / No Argument Constructor
public class Test {
    int i;

    Test(){
        System.out.println("No Argument Constructor");
    }

    public static void main(String[] args) {
        Test T = new Test();
        System.out.println(T.i); // Print Default Constructor
    }

}
