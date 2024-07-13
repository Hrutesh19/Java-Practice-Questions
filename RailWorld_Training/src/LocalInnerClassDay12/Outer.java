package LocalInnerClassDay12;
// This is Static Inner class Example

public class Outer {
    private static int outerData = 10;

    // Static inner class
    public static class StaticInner {
        private int innerData;

        public StaticInner(int innerData) {
            this.innerData = innerData;
        }

        public void display() {
            System.out.println("Outer data: " + outerData);
            System.out.println("Inner data: " + innerData);
        }
    }

    public static void main(String[] args) {
        // This is an instance of the static inner class
        Outer.StaticInner inner = new Outer.StaticInner(20);

        inner.display();
    }
}


