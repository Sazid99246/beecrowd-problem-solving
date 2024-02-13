import java.util.Scanner;

public class BEE1074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int x = Integer.valueOf(scanner.nextLine());
            if (x == 0) {
                System.out.println("NULL");
            } else if (x % 2 == 0) {
                if (x > 0) {
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("EVEN NEGATIVE");
                }
            } else {
                if (x > 0) {
                    System.out.println("ODD POSITIVE");
                } else {
                    System.out.println("ODD NEGATIVE");
                }
            }
        }
        scanner.close();
    }
}
