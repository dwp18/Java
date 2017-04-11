package Chapter2;
import java.util.Scanner;

/**
 * Created by Wahyu on 4/11/2017.
 */
public class Ex2_8_CurrentTime {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the timezone offset to GMT: ");
        int hourModifier = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;

        long totalHour = totalMinutes / 60;
        long currentHours = totalHour % 24;
        long modifiedHours = currentHours + (long)hourModifier;

        System.out.print("The current time is " + modifiedHours + ":" + currentMinutes +  ":" + currentSeconds);
    }
}
