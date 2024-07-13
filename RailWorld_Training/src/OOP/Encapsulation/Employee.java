package OOP.Encapsulation;

// Employee class represents an employee with encapsulated data
public class Employee {
    // Private member variable to store employee ID
    private int Empid;

    // Getter method to access the employee ID
    public int getEmpid() {
        return Empid;
    }

    // Setter method to set the employee ID
    public void setEmpid(int eid) {
        Empid = eid;
    }
}

// Company class to demonstrate encapsulation
class Company {
    public static void main(String[] args) {
        // Creating an instance of the Employee class
        Employee e = new Employee();

        // Setting the employee ID using the setter method
        e.setEmpid(72164804);

        // Getting and printing the employee ID using the getter method
        System.out.println(e.getEmpid());
    }
}
