package Chapter2;
import java.util.Scanner;

/**
 * Created by Wahyu on 4/11/2017.
 */
public class Ex2_9_Acceleration {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter v0, v1, and t: ");
        double velocity1 = input.nextDouble();
        double velocity2 = input.nextDouble();
        double time = input.nextDouble();

        double acceleration = (velocity2 - velocity1) / time;
        double fourDecimals = Math.round(acceleration * 10000);
        double roundedAcceleration = fourDecimals / 10000;

        System.out.print("The average acceleration is " + roundedAcceleration);
    }
}
