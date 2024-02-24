import java.util.Scanner;

public class BEE1759 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();        
        String result = repeat(n);
        System.out.println(result);

        scanner.close();
    }

    public static String repeat(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n - 1; i++) {
            result.append("Ho ");
        }
        result.append("Ho!");
        return result.toString();
    }
}
