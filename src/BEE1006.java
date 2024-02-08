import java.io.IOException;
import java.util.Scanner;

public class BEE1006 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        double A = Double.valueOf(scanner.nextLine());
        double B = Double.valueOf(scanner.nextLine());
        double C = Double.valueOf(scanner.nextLine());

        scanner.close();

        double MEDIA = (A * 2 + B * 3 + C * 5) / (2 + 3 + 5);

        System.out.printf("MEDIA = %.1f%n", MEDIA);
    }
}
