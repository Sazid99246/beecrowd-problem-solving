import java.util.Scanner;

public class BEE1160 {

    // Function to calculate the years needed for A to surpass B
    public static String yearsToSurpass(int PA, int PB, double G1, double G2) {
        int years = 0;
        while (PA <= PB) {
            PA = (int) (PA * (1 + G1 / 100));
            PB = (int) (PB * (1 + G2 / 100));
            years++;
            if (years > 100) {
                return "Mais de 1 seculo.";
            }
        }
        return Integer.toString(years) + " anos.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of test cases
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Loop through each test case
        for (int i = 0; i < T; i++) {
            String[] input = scanner.nextLine().split(" ");
            int PA = Integer.parseInt(input[0]);
            int PB = Integer.parseInt(input[1]);
            double G1 = Double.parseDouble(input[2]);
            double G2 = Double.parseDouble(input[3]);
            String result = yearsToSurpass(PA, PB, G1, G2);
            System.out.println(result);
        }

        scanner.close();
    }
}
