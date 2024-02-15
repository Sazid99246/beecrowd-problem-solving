import java.util.Scanner;

public class BEE1132 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.valueOf(scanner.nextLine());
        int y = Integer.valueOf(scanner.nextLine());

        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        int sum = 0;
        for (int i = x; i <= y; i++) {
            if (i % 13 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        scanner.close();
    }
}
