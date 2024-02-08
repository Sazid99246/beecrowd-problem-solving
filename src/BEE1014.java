import java.io.IOException;
import java.util.Scanner;

public class BEE1014 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int X = Integer.valueOf(scanner.nextLine());
        double Y = Double.valueOf(scanner.nextLine());

        scanner.close();

        double averageConsumption = X / Y;
        System.out.printf("%.3f km/l%n", averageConsumption);
    }
}
