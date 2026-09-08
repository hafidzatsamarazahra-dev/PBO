package id.ac.polinema.tugas;

public class mainCircle {
    public static void main(String[] args) {
        Circle c = new Circle(5);

        System.out.println("Luas lingkaran: " + c.area());
        System.out.println("Keliling lingkaran: " + c.circumference());
    }
}