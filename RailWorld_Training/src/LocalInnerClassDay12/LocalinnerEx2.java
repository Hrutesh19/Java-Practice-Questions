package LocalInnerClassDay12;

/**
 * Create a class Outer that contains a private string field message. Inside this class,
 * define a method displayMessage that contains a local inner class Inner.
 * The Inner class should have a method print that prints the message field of the Outer class.
 * Finally,create an instance of the Outer class and call the displayMessage method to demonstrate
 * the usage of the local inner class
 */
public class LocalinnerEx2 {
    private String message ;

    void displayMessage() {
        class Inner {
            void printData() {
                System.out.println("This message from Outer Class!" + message);
            }
        }

        // This is an instance of the local inner class and call its method
        Inner i = new Inner();
        i.printData();
    }

    public static void main(String[] args) {
        LocalinnerEx2 li = new LocalinnerEx2();
        li.displayMessage();
    }
}

