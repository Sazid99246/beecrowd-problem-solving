import java.util.Scanner;

public class BEE1072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int in = 0;
        int out = 0;

        int n = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int x = Integer.valueOf(scanner.nextLine());
            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        scanner.close();
    }
}
