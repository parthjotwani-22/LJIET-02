
import java.util.Scanner;

public class circle {

    private final double Pi = 3.14;
    private double radius;
    private double area;
    private double circum;

    public void calcArea() {
        area = Pi * radius * radius;
    }

    public void calcCircum() {
        circum = 2 * Pi * radius;
    }

    public void display() {
        System.out.println("Area of circle is: " + area);
        System.out.println("Circumference of circle is: " + circum);
    }

    public void getradius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
        scanner.close();
    }

    public static void main(String[] args) {
        circle cir = new circle();
        cir.getradius();
        cir.calcArea();
        cir.calcCircum();
        cir.display();
    }
}
