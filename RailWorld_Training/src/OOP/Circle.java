package OOP;
/*4. Create a class called Circle with an attribute radius. Include methods calculate_area()
and calculate_circumference() to compute the area and circumference of the circle, respectively. */

public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(10);
        c.calculateArea();
        c.calculateCircumference();
    }

    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);
    }

    public void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference: " + circumference);
    }
}

