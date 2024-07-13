package Serialization;

//Example of Selization
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L; // Generated serialVersionUID for version control
    private String name;
    private String email;
    private int age;
    private String address;

    // Constructor to initialize the Student object
    Student(String name, String email, int age, String address) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
    }

    // Getter and Setter methods for encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        // Create object of Student
        Student s = new Student("Hrutesh", "hruteshghodmare@gmail.com", 24, "Amravati");

        try {
            // Write data to file
            FileOutputStream fos = new FileOutputStream("ob.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Serialize the Student object
            oos.writeObject(s);

            // Close ObjectOutputStream and FileOutputStream to release resources
            oos.close();
            fos.close();

            // Indicate successful serialization
            System.out.println("Object state is transferred to file ob !!");
        } catch (Exception e) {
            // Handle any exceptions that might occur during serialization
            e.printStackTrace();
        }
    }
}
