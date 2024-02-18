import java.util.Scanner;

public class BEE1174 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] A = new double[100];

        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextDouble();
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= 10) {
                System.out.println("A[" + i + "] = " + String.format("%.1f", A[i]));
            }
        }

        scanner.close();
    }
}
