import java.util.Scanner;

public class BEE1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 5; i++) {
            int n = Integer.valueOf(scanner.nextLine());
            if (n % 2 == 0) {
                count++;
            }
        }
        System.out.println(count + " valores pares");
        scanner.close();
    }
}
