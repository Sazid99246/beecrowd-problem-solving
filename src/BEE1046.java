import java.util.Scanner;

public class BEE1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day1 = scanner.nextInt();
        int day2 = scanner.nextInt();

        if (day2 <= day1) {
            day2 += 24;
        }

        int hoursPlayed = day2 - day1;

        System.out.println("O JOGO DUROU " + hoursPlayed + " HORA(S)");

        scanner.close();
    }
}
