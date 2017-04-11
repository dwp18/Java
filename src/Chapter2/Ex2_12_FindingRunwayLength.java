package Chapter2;
import java.util.Scanner;

/**
 * Created by Wahyu on 4/11/2017.
 */
public class Ex2_12_FindingRunwayLength {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the the speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        double length = Math.pow(speed, 2) / (2 * acceleration);

        System.out.print("The minimum runway length for this airplane is " + length);
    }
}
