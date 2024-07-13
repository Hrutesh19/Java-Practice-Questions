package OOP;

/***
 * 6. Create a class called Employee with attributes name, employee_id, and salary.
 * Include a method calculate_bonus() that calculates a bonus
 * amount based on the employee's salary (e.g., 10% of the salary).
  */

public class Employee {
    // Attributes
    private String name;
    private int employeeId;
    private double salary;

    // Constructor
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Method to calculate bonus
    public double calculateBonus() {
        // Assuming bonus is 20% of the salary
        return 0.2 * salary;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee("Hrutesh Ghodmare", 123456, 25833.33);
        System.out.println("Employee Name: "+ employee.name);
        System.out.println("Employee ID: "+ employee.employeeId);
        System.out.println("Employee Salaray: "+ employee.salary);

        // Calculating and printing bonus
        double bonus = employee.calculateBonus();
        System.out.println("Bonus for " + employee.getName() + ": $" + bonus);
    }
}
