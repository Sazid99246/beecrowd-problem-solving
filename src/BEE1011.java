import java.io.IOException;
import java.util.Scanner;

public class BEE1011 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double PI = 3.14159;
        int R = Integer.valueOf(scanner.nextLine());

        scanner.close();

        double volume = (4.0 / 3) * PI * Math.pow(R, 3);

        System.out.printf("VOLUME = %.3f%n", volume);
    }
}
