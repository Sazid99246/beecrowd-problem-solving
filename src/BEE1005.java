import java.io.IOException;
import java.util.Scanner;

public class BEE1005 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double A = Double.valueOf(scanner.nextLine());
        double B = Double.valueOf(scanner.nextLine());

        scanner.close();

        double MEDIA = (A * 3.5 + B * 7.5) / (3.5 + 7.5);

        System.out.printf("MEDIA = %.5f%n", MEDIA);
    }
}
