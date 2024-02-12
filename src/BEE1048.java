import java.util.Scanner;

public class BEE1048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        int increase_rate;

        if (salary <= 400.00) {
            increase_rate = 15;            
        } else if (salary > 400.00 && salary <= 800.00) {
            increase_rate = 12;
        } else if (salary > 800.00 && salary <= 1200.00) {
            increase_rate = 10;
        } else if (salary > 1200.00 && salary <= 2000.00) {
            increase_rate = 7;
        } else {
            increase_rate = 4;
        }

        double salary_increased = ((double) increase_rate / 100) * salary;
        double total_salary = salary + salary_increased;

        System.out.printf("Novo salario: %.2f%n", total_salary);
        System.out.printf("Reajuste ganho: %.2f%n", salary_increased);
        System.out.println("Em percentual: " + increase_rate + " %");

        scanner.close();
    }
}
