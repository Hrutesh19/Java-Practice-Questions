package OOP;

/***
 * 9. Define a class named Animal with attributes name and sound.
 * Include a method make_sound() that prints the sound of the animal.
 *
 */
public class Animal {
    String name;
    String sound;

    Animal(String name, String sound){
        this.name=name;
        this.sound=sound;
    }
    public void makeSouund(){
        System.out.println("Animal Name is: "+name);
        System.out.println("Animal Sound is: "+sound);

    }

    public static void main(String[] args) {
        Animal a = new Animal("Dog","Barking");
        a.makeSouund();
    }
}
/***
 * Another approach of this given code
 * public class Animal {
 *     private String name;
 *     private String sound;
 *
 *     public Animal(String name, String sound) {
 *         this.name = name;
 *         this.sound = sound;
 *     }
 *
 *     public void makeSound() {
 *         System.out.println("Animal Name: " + name);
 *         System.out.println("Animal Sound: " + sound);
 *     }
 *
 *     // Getter methods for name and sound if needed
 *     public String getName() {
 *         return name;
 *     }
 *
 *     public String getSound() {
 *         return sound;
 *     }
 *
 *     public static void main(String[] args) {
 *         Animal dog = new Animal("Dog", "Barking");
 *         dog.makeSound();
 *     }
 * }
 */