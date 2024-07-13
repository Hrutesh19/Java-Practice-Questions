package Constructors;
public class Employee {
    String Name;
    int Empid;

    Employee(String Name, int Empid) {
        this.Name = Name;
        this.Empid = Empid;
    }

    public static void main(String[] args) {
        Employee E1 = new Employee("Hrutesh", 101);
        System.out.println("Name: " + E1.Name + ", Empid: " + E1.Empid);

    }
}


