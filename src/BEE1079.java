import java.util.Scanner;

public class BEE1079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            double a = scanner.nextDouble() * 2;
            double b = scanner.nextDouble() * 3;
            double c = scanner.nextDouble() * 5;

            double avg = (a + b + c) / 10;

            System.out.printf("%.1f%n", avg);
        }

        scanner.close();
    }
}
