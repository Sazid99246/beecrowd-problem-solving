import java.util.Scanner;

public class BEE1016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        scanner.close();

        System.out.println(x * 2 + " minutos");
    }
}
