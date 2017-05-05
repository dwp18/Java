package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 05/05/2017.
 */
public class Ex3_30_CurrentTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the timezone offset to GMT: ");
        int timezoneOffset = input.nextInt();


        // Find milliseconds
        long totalMilliseconds = System.currentTimeMillis();


        // Calculate current seconds
        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;


        // Calculate current minutes
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;


        // Calculate current hours
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;


        // Modifies hours with offset
        long modifiedHours = (long)timezoneOffset + currentHours;


        // Check hours
        // Bigger than 12 or not
        boolean noonTime = modifiedHours > 12;


        // Display
        System.out.print("The current time is ");

        if(noonTime){
            modifiedHours = modifiedHours - 12;
            System.out.print(modifiedHours + ":" + currentMinutes + ":" + currentSeconds + " PM");
        } else {
            System.out.print(modifiedHours + ":" + currentMinutes + ":" + currentSeconds + "AM");
        }


    }
}
