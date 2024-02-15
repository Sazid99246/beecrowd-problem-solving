import java.util.Scanner;

public class BEE1133 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.valueOf(scanner.nextLine());
        int y = Integer.valueOf(scanner.nextLine());

        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        for (int i = x + 1; i < y; i++) {
            if (i % 5 == 2 || i % 5 == 3) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
