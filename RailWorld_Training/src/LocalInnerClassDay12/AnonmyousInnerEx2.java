package LocalInnerClassDay12;

abstract class AnonmyousInnerEx2 {
    public abstract void show();

    public static void main(String[] args) {
        AnonmyousInnerEx2 an = new AnonmyousInnerEx2()

        {
            public void show() {
                System.out.println("In new Show");
            }
        };
        an.show(); // Call the method on the anonymous inner class instance
    }
}
