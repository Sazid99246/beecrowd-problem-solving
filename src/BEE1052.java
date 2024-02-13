import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BEE1052 {
    public static void main(String[] args) {
        Map<Integer, String> months = new HashMap<>() {
            {
                put(1, "January");
                put(2, "February");
                put(3, "March");
                put(4, "April");
                put(5, "May");
                put(6, "June");
                put(7, "July");
                put(8, "August");
                put(9, "September");
                put(10, "October");
                put(11, "November");
                put(12, "December");
            }
        };

        Scanner scanner = new Scanner(System.in);
        int monthNumber = scanner.nextInt();
        System.out.println(months.get(monthNumber));
        scanner.close();
    }
}
