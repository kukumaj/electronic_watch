import java.util.Scanner;

public class electronic_watch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        int secondsInDay = 60 * 60 * 24;
        int secondsInHour = 60 * 60;
        int hours = (seconds % secondsInDay) / secondsInHour;
        int minutes = (seconds % secondsInHour) / 60;
        int seconds2 = seconds % 60;

        int minutesFirstDigit = minutes / 10;
        int minutesLastDigit = minutes % 10;

        int secondsFirstDigit = seconds2 / 10;
        int secondsLastDigit = seconds2 % 10;

        System.out.println(hours + ":" + minutesFirstDigit + minutesLastDigit + ":" + secondsFirstDigit + secondsLastDigit);
    }
}