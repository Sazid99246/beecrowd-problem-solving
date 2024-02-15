import java.util.Scanner;

public class BEE1135 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int start = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(start + " " + (start + 1) + " " + (start + 2) + " PUM");
            start += 4;
        }

        scanner.close();
    }
}
