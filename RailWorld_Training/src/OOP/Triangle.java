package OOP;

/***
 * 8. Create a class called Triangle with attributes side1, side2, and side3.
 * Include methods calculate_area() and is_equilateral() to compute the area of the triangle
 * and check if it's an equilateral triangle, respectively
 */
public class Triangle {
    int side1;
    int side2;
    int side3;

    // Constructor to initialize the sides of the triangle
    Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Method to calculate the area of the triangle
    public void calculateArea(int base, int height) {
        // Using the formula: area = base * height / 2
        double area = (base * height) / 2;
        System.out.println("Area of Triangle is: " + area);
    }

    // Method to check if the triangle is equilateral
    void equilateralTriangle() {
        // Checking if all sides are equal
        if (side1 == side2 && side1 == side3) {
            System.out.println("This is an Equilateral Triangle.");
        } else {
            System.out.println("This is Not an Equilateral Triangle.");
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the Triangle class
        Triangle t = new Triangle(10, 10, 10);

        // Calling the method to calculate the area of the triangle
        t.calculateArea(10, 20);

        // Calling the method to check if the triangle is equilateral
        t.equilateralTriangle();
    }
}

