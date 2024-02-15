import java.util.Scanner;

public class BEE1145 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lineLength = scanner.nextInt();
        int n = scanner.nextInt();
        
        int startNumber = 1; // Start number for the sequence
        
        while (startNumber + lineLength - 1 <= n) {
            for (int i = 0; i < lineLength; i++) {
                System.out.print(startNumber + i);
                if (i < lineLength - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            startNumber += lineLength;
        }
        
        if (startNumber <= n) {
            for (int i = startNumber; i <= n; i++) {
                System.out.print(i);
                if (i < n) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
