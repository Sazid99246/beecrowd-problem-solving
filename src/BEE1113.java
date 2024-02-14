import java.util.Scanner;

public class BEE1113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            if (n1 == n2) {
                break;
            } else {
                if (n1 > n2) {
                    System.out.println("Decrescente");
                } else {
                    System.out.println("Crescente");
                }
            }
        }
        scanner.close();
    }
}
