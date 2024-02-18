import java.util.Scanner;

public class BEE1176 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // N-th term of Fibonacci series

            long fibN = fibonacci(n); // Calculate Fibonacci number for N

            System.out.println("Fib(" + n + ") = " + fibN);
        }

        scanner.close();
    }

    // Function to calculate the Fibonacci number for the given term
    public static long fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        long prevPrev = 0;
        long prev = 1;
        long fib = 0;

        for (int i = 2; i <= n; i++) {
            fib = prevPrev + prev;
            prevPrev = prev;
            prev = fib;
        }

        return fib;
    }
}
