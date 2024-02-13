import java.util.Scanner;

public class BEE1070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input value X
        int x = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Print the 6 consecutive odd numbers from X
        for (int i = x, count = 0; count < 6; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                count++;
            }
        }
    }
}
