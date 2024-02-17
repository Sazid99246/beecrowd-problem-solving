import java.util.Scanner;

public class BEE1165 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (isPrime(x)) {
                System.out.println(x + " eh primo");
            } else {
                System.out.println(x + " nao eh primo");
            }
        }
        scanner.close();
    }

    private static boolean isPrime(int x) {
        if (x == 0 || x == 1) {
            return false;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
