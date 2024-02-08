import java.io.IOException;
import java.util.Scanner;

public class BEE1020 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        int days = scanner.nextInt();

        int years = days / 365;
        days %= 365;

        int months = days / 30;
        days %= 30;

        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(days + " dia(s)");

        scanner.close();

    }
}
