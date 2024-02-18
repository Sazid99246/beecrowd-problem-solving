import java.util.Scanner;

public class BEE1178 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] N = new double[100];
        double n = scanner.nextDouble();
        N[0] = n;

        for (int i = 1; i < N.length; i++) {
            n /= 2;
            N[i] = n;
        }

        for (int i = 0; i < N.length; i++) {
            System.out.printf("N[%d] = %.4f\n", i, N[i]);
        }

        scanner.close();
    }
}
