import java.util.Scanner;

public class BEE1094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.valueOf(scanner.nextLine());

        int total_animals = 0;
        int coelho = 0;
        int rato = 0;
        int sapo = 0;

        for (int i = 0; i < n; i++) {
            String s[] = scanner.nextLine().split(" ");
            total_animals += Integer.valueOf(s[0]);
            if (s[1].equals("C")) {
                coelho += Integer.valueOf(s[0]);
            }
            if (s[1].equals("R")) {
                rato += Integer.valueOf(s[0]);
            }
            if (s[1].equals("S")) {
                sapo += Integer.valueOf(s[0]);
            }
        }

        double coelho_perchantage = (coelho * 100) / (double) total_animals;
        double rato_perchantage = (rato * 100) / (double) total_animals;
        double sapo_perchantage = (sapo * 100) / (double) total_animals;

        System.out.println("Total: " + total_animals + " cobaias");
        System.out.println("Total de coelhos: " + coelho);
        System.out.println("Total de ratos: " + rato);
        System.out.println("Total de sapos: " + sapo);
        System.out.printf("Percentual de coelhos: %.2f %%%n", coelho_perchantage);
        System.out.printf("Percentual de ratos: %.2f %%%n", rato_perchantage);
        System.out.printf("Percentual de sapos: %.2f %%%n", sapo_perchantage);

        scanner.close();
    }
}
