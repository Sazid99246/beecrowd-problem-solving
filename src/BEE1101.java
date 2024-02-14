import java.util.Scanner;

public class BEE1101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            if (n1 <= 0 || n2 <= 0) {
                break;
            }
            if (n1 > n2) {
                int temp = n1;
                n1 = n2;
                n2 = temp;
            }
            int total = 0;
            for (int i = n1; i <= n2; i++) {
                System.out.print(i + " ");
                total += i;
            }
            System.out.println("Sum=" + total);
        }

        scanner.close();
    }
}
