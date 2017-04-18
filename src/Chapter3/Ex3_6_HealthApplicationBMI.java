package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/18/2017.
 */
public class Ex3_6_HealthApplicationBMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter feet: ");
        double feet = input.nextDouble();

        System.out.print("Enter inch: ");
        double inch = input.nextDouble();

        double weightInKilos = (weight * 0.45359237);
        double heightInMeters = (feet * 0.3048) + (inch * 0.0254);

        double bmi = weightInKilos / Math.pow(heightInMeters, 2);

        System.out.println("BMI is: " + bmi);

        if (bmi < 18.5){
            System.out.print("Underweight");
        } else if (bmi < 25.0){
            System.out.print("Normal");
        } else if (bmi < 30.0){
            System.out.print("Overweight");
        } else {
            System.out.print("Obese");
        }
    }
}
