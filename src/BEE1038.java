import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BEE1038 {
    public static void main(String[] args) throws IOException {
        Map<Integer, Double> snacks = new HashMap<>() {
            {
                put(1, 4.00);
                put(2, 4.50);
                put(3, 5.00);
                put(4, 2.00);
                put(5, 1.50);
            }
        };

        Scanner scanner = new Scanner(System.in);

        int productCode = scanner.nextInt();
        int productQuantity = scanner.nextInt();

        double totalPrice = snacks.get(productCode) * productQuantity;
        
        System.out.printf("Total: R$ %.2f%n", totalPrice);

        scanner.close();
    }
}
