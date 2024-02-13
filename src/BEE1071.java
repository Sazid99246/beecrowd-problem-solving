import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BEE1071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.valueOf(scanner.nextLine());
        int n2 = Integer.valueOf(scanner.nextLine());

        int total = 0;
        List<Integer> oddNumbers = new ArrayList<>();

        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        
        for (int i = n1 + 1; i < n2; i++) {
            if (i % 2 != 0) {
                oddNumbers.add(i);
                total += i;
            }
        }

        // for (Integer oddNumber : oddNumbers) {
        //     System.out.println(oddNumber);
        // }

        System.out.println(total);

        scanner.close();
    }
}
