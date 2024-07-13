package LocalInnerClassDay12;

public class MemberInner {

    int a = 66;
    private int b = 20;
    static int c = 10;

    class InnerEx {
        public void doSum() {
            System.out.println("Sum is: " + (a + b + c));
        }
    }

    public static void main(String[] args) {
        MemberInner MI = new MemberInner();

        // Instantiate the inner class using the outer class instance
        MemberInner.InnerEx ob = MI.new InnerEx();
        ob.doSum(); // Call the method of the inner class
    }
}

