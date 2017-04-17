package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/17/2017.
 */
public class Eg3_4_ComputeAndInterpretBMI {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        final double KILOGRAM_PER_POUND = 0.45359237;
        final double METER_PER_INCH = 0.0254;

        double weightInKilos = weight * KILOGRAM_PER_POUND;
        double heightInMeters = height * METER_PER_INCH;

        double bmi = weightInKilos / Math.pow(heightInMeters, 2);

        System.out.println("");
        System.out.println("Your weight in Kilo is " + weightInKilos);
        System.out.println("Your height in Meter is " + heightInMeters);
        System.out.println("BMI is " + bmi);

        if (bmi < 18.5) {
            System.out.print("Underweight");
        } else if (bmi < 25.0) {
            System.out.print("Normal");
        } else if (bmi < 30.0) {
            System.out.print("Overweight");
        } else {
            System.out.print("Obese");
        }
    }
}
