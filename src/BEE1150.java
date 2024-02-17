import java.util.Scanner;

public class BEE1150 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int z;
        do {
            z = scanner.nextInt();
        } while (z <= x);
        
        int sum = x;
        int count = 1;

        while (sum < z) {
            x++;
            sum += x;
            count++;            
        }

        System.out.println(count);

        scanner.close();
    }
}
