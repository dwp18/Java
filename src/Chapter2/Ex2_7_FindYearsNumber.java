package Chapter2;
import java.util.Scanner;


/**
 * Created by Wahyu on 4/11/2017.
 */
public class Ex2_7_FindYearsNumber {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        /*int years = minutes / 525600;
        int currentMinutes = minutes % 525600;

        int days = currentMinutes / 1440;
        */

        int minutesPerDays = 60 * 24; //1440
        int minutesPerYears = 365 * minutesPerDays; //525600
        int years = minutes / minutesPerYears;
        int currentMinutes = minutes % minutesPerYears;
        int days = currentMinutes / minutesPerDays;

        System.out.print(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
