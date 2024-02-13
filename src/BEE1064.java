import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BEE1064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = new ArrayList<>();
        
        int positiveNumbers = 0;

        double sum = 0.0;

        for (int i = 0; i < 6; i++) {
            Double n = Double.valueOf(scanner.nextLine());
            numbers.add(n);
        }

        for (double number : numbers) {
            if (number > 0) {
                positiveNumbers++;
                sum += number;
            }
        }

        double avg = sum / positiveNumbers;

        System.out.println(positiveNumbers + " valores positivos");
        System.out.printf("%.1f%n", avg);

        scanner.close();
    }
}
