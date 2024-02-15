import java.util.Scanner;

public class BEE1144 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + (i * i) + " " + (i * i * i));
            System.out.println(i + " " + (i * i + 1) + " " + (i * i * i + 1));
        }

        scanner.close();
    }
}
