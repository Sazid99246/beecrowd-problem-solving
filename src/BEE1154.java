import java.util.Scanner;

public class BEE1154 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;
        int count = 0;

        do {
            n = scanner.nextInt();
            if (n > 0) {
                sum += n;
                count++;                    
            }
        } while (n > 0);

        double avg = (double) sum / (double) count;
        System.out.printf("%.2f%n", avg); 

        scanner.close();
    }
}
