import java.io.IOException;
import java.util.Scanner;

public class BEE1018 {
    public static void main(String[] args) throws IOException {
        int[] notes = {100, 50, 20, 10, 5, 2};
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.println(N);

        for (int note : notes) {
            System.out.println(N / note + " nota(s) de R$ " + note + ",00"); 
            N %= note;
        }

        System.out.println(N + " nota(s) de R$ 1,00");

        scanner.close();
    }
}
