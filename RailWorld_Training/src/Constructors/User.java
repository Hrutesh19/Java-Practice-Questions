package Constructors;

//Constructor Overloading Example
public class User {

    int age;
    String name;
    //Parameterized Constructor-1
    User(int a, String n) {
        age = a; //initialization
        name = n; //initialization
    }
    //Parameterized Constructor-2
    User(String n) {
        name = n;
    }

    public static void main(String[] args) {
        User u1 = new User(24, "Hrutesh"); // Creating object

        System.out.println("Age: " + u1.age + " Name: " + u1.name);

        User u2 = new User("Aadesh"); // Age not provided for u2
        System.out.println("Name: " + u2.name); // Printing only name for u2
    }
}
