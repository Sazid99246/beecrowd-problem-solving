import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BEE1042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        int[] numsArray = { n1, n2, n3 };

        List<Integer> nums = new ArrayList<>();
        for (int num : numsArray) {
            nums.add(num);
        }

        Collections.sort(nums);

        for (Integer num : nums) {
            System.out.println(num);
        }

        System.out.println();

        for (int num : numsArray) {
            System.out.println(num);
        }

        scanner.close();
    }
}
