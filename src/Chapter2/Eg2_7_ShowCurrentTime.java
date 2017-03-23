package Chapter2;
import java.util.Scanner;

/**
 * Created by Wahyu on 3/23/2017.
 */
public class Eg2_7_ShowCurrentTime {
    public static void main(String[] args){
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHours = (totalHours % 60) -5;

        System.out.println("Current time in Jakarta is " + currentHours + ":" + currentMinutes + ":" + currentSeconds + " GMT");
    }
}
