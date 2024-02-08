import java.io.IOException;
import java.util.Scanner;

public class BEE1007 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        int A = Integer.valueOf(scanner.nextLine());
        int B = Integer.valueOf(scanner.nextLine());
        int C = Integer.valueOf(scanner.nextLine());
        int D = Integer.valueOf(scanner.nextLine());

        scanner.close();
        
        int DIFERENCA = A * B - C * D;

        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}
