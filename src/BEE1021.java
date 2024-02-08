import java.io.IOException;
import java.util.Scanner;

public class BEE1021 {
    public static void main(String[] args) throws IOException {
        int[] notes = {100, 50, 20, 10, 5, 2};
        double[] coins = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};

        Scanner scanner = new Scanner(System.in);
        double N = scanner.nextDouble();

        int integerPart = (int)N;
        double fractionalPart = N - integerPart;

        System.out.println("NOTAS:");
        for (int note : notes) {
            int numberOfNotes = integerPart / note;
            System.out.println(numberOfNotes + " nota(s) de R$ " + String.format("%.2f", (double)note));
            integerPart -= numberOfNotes * note;
        }

        System.out.println("MOEDAS:");
        // This line adds the remaining integer part (which could only be 1 or 0) as coins
        fractionalPart += integerPart; 

        for (double coin : coins) {
            int numberOfCoins = (int)(fractionalPart / coin);
            System.out.println(numberOfCoins + " moeda(s) de R$ " + String.format("%.2f", coin));
            fractionalPart -= numberOfCoins * coin;
            fractionalPart = Math.round(fractionalPart * 100.0) / 100.0; // Rounding to handle floating-point arithmetic issues
        }

        scanner.close();
    }
}
