import java.util.Scanner;

public class BEE1099 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();

            int total = 0;

            if (n1 > n2) {
                int temp = n1;
                n1 = n2;
                n2 = temp;
            }

            for (int j = n1 + 1; j < n2; j++) {
                if (j % 2 != 0) {
                    total += j;
                }
            }

            System.out.println(total);

        }
        scanner.close();
    }
}
