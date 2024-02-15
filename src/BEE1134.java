import java.util.Scanner;

public class BEE1134 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alcohol_count = 0;
        int gasoline_count = 0;
        int diesel_count = 0;

        while (true) {
            int n = scanner.nextInt();
            if (n == 4) {
                break;
            } else {
                if (n == 1) {
                    alcohol_count++;
                } else if (n == 2) {
                    gasoline_count++;
                } else if (n == 3) {
                    diesel_count++;
                }
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcohol_count);
        System.out.println("Gasolina: " + gasoline_count);
        System.out.println("Diesel: " + diesel_count);

        scanner.close();
    }
}
