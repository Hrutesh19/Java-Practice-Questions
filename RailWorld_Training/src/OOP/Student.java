package OOP;

/*
3.Define a class named Student with attributes name, age, and grade.
Include a method is_teenager() that returns True
if the student's age is between 13 and 19, and False otherwise.
*/
public class Student {
    String name;
    int age;
    String grade;

    // Constructor to initialize name, age, and grade
    Student(String name, int age, String grade) {
        this.name = name; // Initialize name attribute with the provided name
        this.age = age;
        this.grade = grade;
    }

    public static void main(String[] args) {

        Student S = new Student("Hrutesh", 24, "BE Graduated");
        // Call the isTeenager method to check if the student is a teenager
        S.isTeenager();
    }

    // Method to check if the student is a teenager
    public void isTeenager() {
        // Check if age is between 13 and 19
        if (age >= 13 && age <= 19) {

            System.out.println(name + " is a Teenager");
        } else {

            System.out.println(name + " is not a Teenager");
        }
    }

}

