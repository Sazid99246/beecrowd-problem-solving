import java.util.Scanner;

public class BEE1114 {
    public static void main(String[] args) {
        final int PASSWORD = 2002;
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            int n = scanner.nextInt();
            if (n == PASSWORD) {
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha Invalida");
            }
        }
        scanner.close();
    }
}
