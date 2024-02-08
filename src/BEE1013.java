import java.util.Scanner;

public class BEE1013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        scanner.close();

        if (x > y) {
            if (x > z) {
                System.out.println(x + " eh o maior");
            } else {
                System.out.println(z + " eh o maior");
            }
        } else {
            if (y > z) {
                System.out.println(y + " eh o maior");
            } else {
                System.out.println(z + " eh o maior");
            }
        }
    }
}
