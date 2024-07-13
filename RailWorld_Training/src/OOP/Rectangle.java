package OOP;

/*2.Create a class named Rectangle with attributes length and width.
Include methods calculate_area() and calculate_perimeter() to compute the area and perimeter of
the rectangle, respectively*/

public class Rectangle {
    double length; // store the length of the rectangle
    double width;  //  store the width of the rectangle

    // Constructor to initialize the length and width of the rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    // Method to calculate and print the area of the rectangle
    public void calculateArea() {
        // Calculate area by multiplying length and width
        double area = length * width;
        // Print the calculated area
        System.out.println("Area: " + area);
    }

    // Method to calculate and print the perimeter of the rectangle
    public void calculatePerimeter() {
        // Calculate perimeter using the formula: 2 * (length + width)
        double perimeter = 2 * (length + width);
        // Print the calculated perimeter
        System.out.println("Perimeter: " + perimeter);
    }

    // Main method to demonstrate the usage of Rectangle class
    public static void main(String[] args) {
        // Create a new Rectangle object with length 5.0 and width 3.0
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        // Call the method to calculate and print the area
        rectangle.calculateArea();
        // Call the method to calculate and print the perimeter
        rectangle.calculatePerimeter();
    }
}


