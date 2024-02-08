import java.util.Scanner;

public class BEE1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seconds = scanner.nextInt();

        scanner.close();

        int hours = seconds / 3600;
        int remainingSeconds = seconds % 3600;
        int minutes = remainingSeconds / 60;
        int remainingSecondsOutput = remainingSeconds % 60;

        System.out.println(hours + ":" + minutes + ":" + remainingSecondsOutput);
    }
}
