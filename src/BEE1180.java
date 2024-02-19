import java.util.Scanner;

public class BEE1180 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] X = new int[N];

        for (int i = 0; i < X.length; i++) {
            int n = scanner.nextInt();
            X[i] = n;
        }
        
        int min = X[0];
        int index = 0;

        for (int i = 0; i < X.length; i++) {
            if (X[i] < min) {
                min = X[i];
            }
        }

        for (int i = 0; i < X.length; i++) {
            if (min == X[i]) {
                index = i;
            }
        }

        System.out.println("Menor valor: " + min);
        System.out.println("Posicao: " + index);

        scanner.close();
    }
}
