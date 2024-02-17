import java.util.Scanner;

public class BEE1172 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        replace(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println("X[" + i + "] = " + nums[i]);            
        }

        scanner.close();
    }

    private static void replace(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                nums[i] = 1;
            }
        }
    } 
}
