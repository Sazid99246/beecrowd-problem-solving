import java.util.Scanner;

public class BEE1073 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "^2" + " = " + i * i);
            }
        }

        scanner.close();
    }
}
