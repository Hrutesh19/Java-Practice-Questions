package Constructors;

//Example for This keyword
public class ThisKeyDemo {

    //instance Variable
    double width, height, depth;
    //Parameterized Constructor
    ThisKeyDemo(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    public static void main(String[] args) {
        ThisKeyDemo t1 = new ThisKeyDemo(10, 20, 30);//objet creation

        System.out.println(" Width: " +t1.width );
        System.out.println(" Height: "+ t1.height);
        System.out.println(" Depth: "+ t1.depth);
    }
}

