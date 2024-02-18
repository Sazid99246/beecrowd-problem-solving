import java.util.Scanner;

public class BEE1177 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[1000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i % n;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("N[" + i + "] = " + arr[i]);
        }

        scanner.close();
    }
}
