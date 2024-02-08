import java.io.IOException;
import java.util.Scanner;

public class BEE1012 {
    private static final double PI = 3.14159;

    private double triangleArea(double a, double c) {
        return (a * c) / 2.0;
    }

    private double circleArea(double c) {
        return PI * c * c;
    }

    private double trapeziumArea(double a, double b, double c) {
        return ((a + b) / 2) * c;
    }

    private double squareArea(double b) {
        return b * b;
    }

    private double rectangleArea(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) throws IOException {
        BEE1012 main = new BEE1012();
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        scanner.close();

        System.out.printf("TRIANGULO: %.3f%n", main.triangleArea(a, c));
        System.out.printf("CIRCULO: %.3f%n", main.circleArea(c));
        System.out.printf("TRAPEZIO: %.3f%n", main.trapeziumArea(a, b, c));
        System.out.printf("QUADRADO: %.3f%n", main.squareArea(b));
        System.out.printf("RETANGULO: %.3f%n", main.rectangleArea(a, b));
    }
}
