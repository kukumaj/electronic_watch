import java.util.Scanner;

public class electronic_watch {
    public static void main(String[] args) {
        int secondsInADay = 86400;
        int secondsInAnHour =3600;
        int secondsInAMinute = 60;
        Scanner scan = new Scanner(System.in);
        System.out.println("Give value of seconds since midnight: ");
        int input = scan.nextInt();
        int hours = (input % secondsInADay) / secondsInAnHour;
        int minutes = (input % secondsInAnHour) / secondsInAMinute;
        int seconds = input % secondsInAMinute;

        System.out.println(hours+":"+minutes+":"+seconds);
    }
}
