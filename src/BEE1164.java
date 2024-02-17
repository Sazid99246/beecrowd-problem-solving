import java.util.Scanner;

public class BEE1164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (isPerfectNumber(x)) {
                System.out.println(x + " eh perfeito");
            } else {
                System.out.println(x + " nao eh perfeito");
            }
        }

        scanner.close();
    }

    private static boolean isPerfectNumber(int n) {
        int total = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                total += i;
            }
        }
        return n == total;
    }
}
