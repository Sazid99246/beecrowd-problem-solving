import java.util.Scanner;

public class BEE1151 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String s = "";
        int[] sequence = fibonacciSequence(n);
        for (int i = 0; i < sequence.length - 1; i++) {
            s += (sequence[i] + " ");
        }
        s += sequence[sequence.length - 1];
        System.out.println(s);

        scanner.close();
    }

    public static int[] fibonacciSequence(int n) {
        int[] fibSequence = new int[n];
        fibSequence[0] = 0;
        if (n > 1) {
            fibSequence[1] = 1;
            for (int i = 2; i < n; i++) {
                fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
            }
        }
        return fibSequence;
    }
}
