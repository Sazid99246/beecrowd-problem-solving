import java.util.Scanner;

public class BEE1158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            System.out.println(sumOfOddNums(X, Y));
        }
        scanner.close();
    }

    private static int sumOfOddNums(int x, int y) {
        int sum = 0;
        int n = 0;
        if (x % 2 == 0) {
            do {
                sum += (x + 1);
                n++;
                x += 2;
            } while (n != y);
        } else {
            do {
                sum += x;
                n++;
                x += 2;
            } while (n != y);
        }
        return sum;
    }
}
