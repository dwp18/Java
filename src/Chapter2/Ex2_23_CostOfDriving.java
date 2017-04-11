package Chapter2;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/11/2017.
 */
public class Ex2_23_CostOfDriving {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        double gallons = distance / milesPerGallon;
        double cost = gallons * pricePerGallon;

        double twoDecimals = (int)(cost * 100);
        double costOfDriving = twoDecimals / 100;

        System.out.print("Enter price per gallon $" + costOfDriving);
    }
}
