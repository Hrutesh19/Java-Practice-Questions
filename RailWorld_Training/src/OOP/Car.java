package OOP;

/**
 * 1.Define a class named Car with attributes make, model, and year.
 * Include a method display_info() that prints out the car's make, model, and year.
 */

public class Car {
    String Make;
    String Model;
    int Year;

    // Constructor to initialize the attributes
    public Car(String make, String model, int year) {
        Make = make;
        Model = model;
        Year = year;
    }

    public static void main(String[] args) {
        // Create an instance of Car
        Car c = new Car("Hyundai", "ABC", 2024);

        // Call display_info method to print car info
        c.display_info();
    }

    // Method to display car info
    public void display_info() {
        System.out.println("Make: " + Make);
        System.out.println("Model: " + Model);
        System.out.println("Year: " + Year);
    }
}




