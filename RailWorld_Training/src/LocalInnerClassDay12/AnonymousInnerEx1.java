package LocalInnerClassDay12;

abstract class Person {
    abstract void eat();
}
public class AnonymousInnerEx1 {
    public static void main(String[] args) {
        // Using an anonymous inner class to implement the abstract method
        Person p = new Person() {
            void eat() {
                System.out.println("These fruits are fresh.");
            }
        };
        p.eat(); // Call the method on the anonymous inner class instance
    }
}

