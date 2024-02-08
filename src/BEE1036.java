import java.io.IOException;
import java.util.Scanner;

public class BEE1036 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double disc = Math.pow(b, 2) - 4 * a * c;

        if (a == 0 || disc < 0) {
            System.out.println("Impossivel calcular");
        } else {

            double sqrtDisc = Math.sqrt(disc);
            double R1 = (-b + sqrtDisc) / (2 * a);
            double R2 = (-b - sqrtDisc) / (2 * a);

            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }
        scanner.close();
    }
}
