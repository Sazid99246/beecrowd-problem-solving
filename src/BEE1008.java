import java.io.IOException;
import java.util.Scanner;

public class BEE1008 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int NUMBER = Integer.valueOf(scanner.nextLine());
        int HOURS = Integer.valueOf(scanner.nextLine());
        double SALARYPERHOUR = Double.valueOf(scanner.nextLine());

        scanner.close();

        double SALARY = HOURS * SALARYPERHOUR;

        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f%n", SALARY);
    }
}
