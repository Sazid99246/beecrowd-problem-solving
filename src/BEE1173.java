import java.util.Scanner;

public class BEE1173 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int V = scanner.nextInt();
        int[] N = new int[10];

        for (int i = 0; i < N.length; i++) {
            N[i] = V;
            V *= 2;
        }

        for (int i = 0; i < N.length; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }

        scanner.close();
    }
}
