import java.io.IOException;
import java.util.Scanner;

public class BEE1017 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int spentTime = Integer.valueOf(scanner.nextLine());
        int speedPerHour = Integer.valueOf(scanner.nextLine());

        scanner.close();

        int totalLength = spentTime * speedPerHour;
        double fuelNeeded = totalLength / 12.0;

        System.out.printf("%.3f%n", fuelNeeded);
    }
}
