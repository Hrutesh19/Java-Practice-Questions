package Constructors;
//Parametrized constructor
public class ParaDemo {
    static String Name;
    ParaDemo(String Name){
        this.Name= Name;

    }
    public static void main(String[]args){
        ParaDemo P1 = new ParaDemo("Hrutesh Ghodmare ");
        System.out.println("Name: "+P1.Name);
    }
}
