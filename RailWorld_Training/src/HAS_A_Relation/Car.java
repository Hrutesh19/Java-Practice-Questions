package HAS_A_Relation;

/***
 * Problem Statement:
 * Create a Java program for a car dealership system. Each car has a model and an engine type.
 * Implement classes for `Car` and `Engine`.
 * Demonstrate the "HAS-A" relationship between them by storing an `Engine` object inside each `Car` object.
 */


class Engine {
    private final String type; // Type of the engine

    // Constructor to initialize the engine type
    Engine(String type) {
        this.type = type;
    }

    // Method to get the engine type
    String getType() {
        return type;
    }
}

// Car class representing a car in the dealership
public class Car {
    private final String model; // Model of the car
    private final Engine engine; // Engine of the car (HAS-A relationship with Engine)

    // Constructor to initialize the car model and engine
    Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    // Method to get the car model
    public String getModel() {
        return model;
    }

    // Method to get the car engine
    public Engine getEngine() {
        return engine;
    }
}

// Main class to demonstrate the car dealership system
class Main {
    public static void main(String[] args) {
        // Create an Engine instance
        Engine e = new Engine("Gen-4 5.0L Coyote™ V8");

        // Create a Car instance with the specified model and engine
        Car c = new Car("Ford Mustang", e);

        // Print the details of the car
        System.out.println("Car Model is: " + c.getModel());
        System.out.println("Car Engine is: " + c.getEngine().getType());
    }
}



