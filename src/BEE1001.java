import java.io.IOException;
import java.util.Scanner;

public class BEE1001 extends IOException {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.valueOf(scanner.nextLine());
        int b = Integer.valueOf(scanner.nextLine());

        scanner.close();

        int x = a + b;

        System.out.println("X = " + x);
    }
}
