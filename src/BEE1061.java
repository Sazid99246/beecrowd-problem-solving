import java.util.Scanner;

public class BEE1061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the beginning day and time of the event
        String beginningDay = scanner.nextLine();
        String[] beginningTime = scanner.nextLine().split(" : ");
        int beginDay = Integer.parseInt(beginningDay.split(" ")[1]);
        int beginHour = Integer.parseInt(beginningTime[0]);
        int beginMinute = Integer.parseInt(beginningTime[1]);
        int beginSecond = Integer.parseInt(beginningTime[2]);

        // Input for the end day and time of the event
        String endingDay = scanner.nextLine();
        String[] endingTime = scanner.nextLine().split(" : ");
        int endDay = Integer.parseInt(endingDay.split(" ")[1]);
        int endHour = Integer.parseInt(endingTime[0]);
        int endMinute = Integer.parseInt(endingTime[1]);
        int endSecond = Integer.parseInt(endingTime[2]);

        // Calculate the total duration of the event in seconds
        int totalSeconds = calculateTotalSeconds(beginDay, beginHour, beginMinute, beginSecond,
                                                 endDay, endHour, endMinute, endSecond);

        // Convert total seconds to days, hours, minutes, and seconds
        int days = totalSeconds / (24 * 60 * 60);
        totalSeconds %= (24 * 60 * 60);
        int hours = totalSeconds / (60 * 60);
        totalSeconds %= (60 * 60);
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        // Output the duration of the event
        System.out.println(days + " dia(s)");
        System.out.println(hours + " hora(s)");
        System.out.println(minutes + " minuto(s)");
        System.out.println(seconds + " segundo(s)");

        scanner.close();
    }

    // Function to calculate the total duration of the event in seconds
    private static int calculateTotalSeconds(int beginDay, int beginHour, int beginMinute, int beginSecond,
                                             int endDay, int endHour, int endMinute, int endSecond) {
        int totalSeconds = 0;

        // Convert both the beginning and ending days and times to seconds
        totalSeconds += (endDay - beginDay) * 24 * 60 * 60;
        totalSeconds += (endHour - beginHour) * 60 * 60;
        totalSeconds += (endMinute - beginMinute) * 60;
        totalSeconds += (endSecond - beginSecond);

        return totalSeconds;
    }
}
