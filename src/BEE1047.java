import java.util.Scanner;

public class BEE1047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading start and end times in hours and minutes
        int startHour = scanner.nextInt();
        int startMinute = scanner.nextInt();
        int endHour = scanner.nextInt();
        int endMinute = scanner.nextInt();

        // Convert everything to minutes for easy calculation
        int startTimeInMinutes = startHour * 60 + startMinute;
        int endTimeInMinutes = endHour * 60 + endMinute;

        // Calculate duration
        int durationInMinutes;
        if (endTimeInMinutes <= startTimeInMinutes) {
            // Game ends the next day
            durationInMinutes = (24 * 60 - startTimeInMinutes) + endTimeInMinutes;
        } else {
            // Game ends the same day
            durationInMinutes = endTimeInMinutes - startTimeInMinutes;
        }

        // Convert back to hours and minutes
        int durationHours = durationInMinutes / 60;
        int durationMinutes = durationInMinutes % 60;

        System.out.println("O JOGO DUROU " + durationHours + " HORA(S) E " + durationMinutes + " MINUTO(S)");

        scanner.close();
    }
}
