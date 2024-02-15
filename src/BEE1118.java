import java.util.Scanner;

public class BEE1118 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double x = readValidScore(scanner);
            double y = readValidScore(scanner);
            double media = (x + y) / 2;
            System.out.printf("media = %.2f%n", media);
            
            if (!askForNewCalculation(scanner)) {
                break;
            }
        }

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

    private static boolean askForNewCalculation(Scanner scanner) {
        System.out.println("novo calculo (1-sim 2-nao)");
        int response = scanner.nextInt();
        while (response < 1 || response > 2) {
            System.out.println("novo calculo (1-sim 2-nao)");
            response = scanner.nextInt();
        }
        return response == 1;
    }
}
