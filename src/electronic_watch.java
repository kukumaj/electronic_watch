import java.util.Scanner;

public class electronic_watch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give value of seconds since midnight: ");
        int secondsSinceMidnight = scanner.nextInt();

        int secondsInDay = 60 * 60 * 24;
        int secondsInHour = 60 * 60;
        int hours = (secondsSinceMidnight % secondsInDay) / secondsInHour;
        int minutes = (secondsSinceMidnight % secondsInHour) / 60;
        int seconds = secondsSinceMidnight % 60;

        int minutesFirstDigit = minutes / 10;
        int minutesLastDigit = minutes % 10;

        int secondsFirstDigit = seconds / 10;
        int secondsLastDigit = seconds % 10;

        System.out.println(hours + ":" + minutesFirstDigit + minutesLastDigit + ":" + secondsFirstDigit + secondsLastDigit);
    }
}