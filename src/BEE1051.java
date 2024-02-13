import java.util.Scanner;

public class BEE1051 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salary = scanner.nextDouble();
        double tax = calculateTax(salary);
        
        if (tax == 0.00) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", tax);
        }

        scanner.close();
    }

    public static double calculateTax(double salary) {
        if (salary <= 2000.00) {
            return 0.00;
        } else if (salary <= 3000.00) {
            return (salary - 2000.00) * 0.08;
        } else if (salary <= 4500.00) {
            return 1000 * 0.08 + (salary - 3000.00) * 0.18;
        } else {
            return 1000 * 0.08 + 1500.00 * 0.18 + (salary - 4500.00) * 0.28;
        }
    }
}
