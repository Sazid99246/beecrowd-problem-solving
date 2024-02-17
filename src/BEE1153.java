import java.util.Scanner;

public class BEE1153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();

        System.out.print(factorial(n));

        scanner.close();
    }

    private static int factorial(int n) {
        int prod;
        if (n == 0) {
            prod = 0;
        } else if (n == 1) {
            prod = 1;
        } else {
            prod = n * factorial(n - 1);
        }
        return prod;
    }
}
