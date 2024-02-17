import java.util.Scanner;

public class BEE1159 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            int sum = 0;
            if (n % 2 != 0) {
                n++; // Make n even
            }
            for (int i = 0; i < 5; i++) {
                sum += n + (i * 2);
            }
            System.out.println(sum);
        }

        scanner.close();
    }
}
