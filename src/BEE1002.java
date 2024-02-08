import java.io.IOException;
import java.util.Scanner;

public class BEE1002 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double R = Double.valueOf(scanner.nextLine());

        scanner.close();

        double area = 3.14159 * R * R;
        System.out.printf("A=%.4f%n", area);
    }
}
