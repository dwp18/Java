package Chapter2;
import java.util.Scanner;

/**
 * Created by Wahyu on 4/11/2017.
 */
public class Ex2_10_EnergyCalculation {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double mass = input.nextDouble();

        System.out.print("Enter the initial temperature: ");
        double initialTemp = input.nextDouble();

        System.out.print("Enter the final temperature: ");
        double finalTemp = input.nextDouble();

        double energy = mass * (finalTemp - initialTemp) * 4184;

        System.out.print("The energy needed is " + energy);
    }
}
