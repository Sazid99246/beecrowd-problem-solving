import java.util.Scanner;

public class BEE1115 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x == 0 || y == 0) {
                break;
            }
            if (x > 0) {
                if (y > 0) {
                    System.out.println("primeiro");                    
                } else {
                    System.out.println("quarto");
                }
            }
            if (x < 0) {
                if (y < 0) {
                    System.out.println("terceiro");                    
                } else {
                    System.out.println("segundo");
                }
            }
        }
        scanner.close();
    }
}
