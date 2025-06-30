package Polymorphism;

public class Main {
    public static void main(String[] args) {
        // Static Polymorphism
        // Calculator c = new Calculator();
        // System.out.println(c.add(2, 3));
        // System.out.println(c.add(2, 3, 4));
        // System.out.println(c.add(2, 3, 4, 5.6));

        // Dynamic Polymorphism
        // Circle c = new Circle();
        // doDrawing(c);

        // Rectangle r = new Rectangle();
        // doDrawing(r);

        Circle c1 = new Circle();
        doDrawing(c1);
    }

    public static void doDrawing(Shape s) {
        s.draw();
        Circle c1 = (Circle)s; // Downcasting
        c1.draw();
    }
}