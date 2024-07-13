package LocalInnerClassDay12;


public class LocalinnerEx1 {
    private int X = 20;

    void printData() {

        // This is  a local inner class inside the method
        class LocalInner {

            void show() {
                System.out.println("X: " + X);
            }
        }

        // This is an instance of the local inner class and call its method
        LocalInner li = new LocalInner();
        li.show();
    }

    public static void main(String[] args) {
        // this is  an instance of the outer class and call the printData method
        LocalinnerEx1 ex = new LocalinnerEx1();
        ex.printData();
    }
}

