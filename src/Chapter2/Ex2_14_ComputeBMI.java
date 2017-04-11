package Chapter2;
import java.util.Scanner;


/**
 * Created by Wahyu on 4/11/2017.
 */
public class Ex2_14_ComputeBMI {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        double weightInKilos = weight * 0.45359237;
        double heightInMeters = height * 0.0254;

        double bmi = weightInKilos / Math.pow(heightInMeters, 2);

        System.out.print("BMI is: " + bmi);
    }
}
