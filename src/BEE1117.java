import java.util.Scanner;

public class BEE1117 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = readValidScore(scanner);
        double y = readValidScore(scanner);

        double media = (x + y) / 2;

        System.out.printf("media = %.2f%n", media);

        scanner.close();
    }

    private static double readValidScore(Scanner scanner) {
        double score = scanner.nextDouble();
        while (score < 0 || score > 10) {
            System.out.println("nota invalida");
            score = scanner.nextDouble();
        }
        return score;
    }
}
