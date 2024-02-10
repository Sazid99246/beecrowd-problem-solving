import java.util.Scanner;

public class BEE1043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            double perimiter = a + b + c;
            System.out.printf("Perimetro = %.1f%n", perimiter);
        } else {
            double area = ((a + b) / 2) * c;
            System.out.printf("Area = %.1f%n", area);
        }

        scanner.close();
    }
}
