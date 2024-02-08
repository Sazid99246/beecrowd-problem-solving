import java.io.IOException;
import java.util.Scanner;

public class BEE1010 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        @SuppressWarnings("unused")
        int codeOfProduct1 = scanner.nextInt();
        int amountOfProduct1 = scanner.nextInt();
        double priceOfProduct1 = scanner.nextDouble();

        @SuppressWarnings("unused")
        int codeOfProduct2 = scanner.nextInt();
        int amountOfProduct2 = scanner.nextInt();
        double priceOfProduct2 = scanner.nextDouble();

        scanner.close();

        double totalPrice = amountOfProduct1 * priceOfProduct1 + amountOfProduct2 * priceOfProduct2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalPrice);
    }
}
