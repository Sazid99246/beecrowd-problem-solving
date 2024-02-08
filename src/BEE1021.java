import java.io.IOException;
import java.util.Scanner;

public class BEE1021 {
    public static void main(String[] args) throws IOException {
        double[] notes = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00};
        Scanner scanner = new Scanner(System.in);
        double N = scanner.nextDouble();

        System.out.println("NOTAS:");

        for (double note : notes) {
            System.out.println(N / note + " nota(s) de R$ " + note); 
            N %= note;
        }

        System.out.println(N + " nota(s) de R$ 1.00");

        scanner.close();
    }
}
