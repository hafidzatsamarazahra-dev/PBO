package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        // Rectangle original = new Rectangle(6,4);

        // System.out.println("Area: " + original.area());

        // Rectangle copy = original;
        // copy.width = 10;
        // System.out.println("Via original: " + original.area());
        // System.out.println("Via copy: " + copy.area());

        Rectangle[] shapes = new Rectangle[3];
        shapes[0] = new Rectangle(6, 4);
        shapes[1] = new Rectangle(3, 3);
        shapes[2] = new Rectangle(8, 2);

        for (Rectangle r : shapes){
            System.out.println("Area: " + r.area() + ", Perimeter: " + r.perimeter());
        }

        Student s = new Student("Nadia", "S001", 3.8);
        System.out.println(s.describe());

        // Rectangle empty = null;
        // System.out.println(empty.area());
    }
}
