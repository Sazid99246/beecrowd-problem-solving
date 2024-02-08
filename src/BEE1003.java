import java.io.IOException;
import java.util.Scanner;

public class BEE1003 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.valueOf(scanner.nextLine());
        int b = Integer.valueOf(scanner.nextLine());

        scanner.close();

        int SOMA = a + b;

        System.out.println("SOMA = " + SOMA);        
    }
}
