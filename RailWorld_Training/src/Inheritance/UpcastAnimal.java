package Inheritance;

import javax.swing.plaf.synth.SynthSpinnerUI;

/* Upcasting: Upcasting is when you convert a subclass type to a superclass type.
It's called "upcasting" because you're going up the class hierarchy.
In simpler terms, you're treating a specialized object as if it were a more general type
 */
//Example of upcasting

public class UpcastAnimal {
    void eat() {
        System.out.println("Animal is Eating");
    }
}

class Dog extends UpcastAnimal {
    void bark() {
        System.out.println("Dog is Barking");
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        UpcastAnimal upcastAnimal = dog; // Upcasting
        upcastAnimal.eat(); // Accessing eat() method of UpcastingAnimal
    }
}


