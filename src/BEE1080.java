import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BEE1080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            int n = Integer.valueOf(scanner.nextLine());
            nums.add(n);
        }

        int max = Collections.max(nums);
        int maxPosition = nums.indexOf(max) + 1;

        System.out.println(max);
        System.out.println(maxPosition);

        scanner.close();
    }
}
