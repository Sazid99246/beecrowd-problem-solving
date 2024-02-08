import java.io.IOException;
import java.util.Scanner;

public class BEE1009 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        @SuppressWarnings("unused")
        String name = String.valueOf(scanner.nextLine());
        double salary = Double.valueOf(scanner.nextLine());
        double soldTotal = Double.valueOf(scanner.nextLine());

        scanner.close();

        double total = salary + soldTotal * 0.15;

        System.out.printf("TOTAL = R$ %.2f%n", total);
    }
}
