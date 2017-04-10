package Chapter2;
import java.util.Scanner;

/**
 * Created by Wahyu on 4/10/2017.
 */
public class Eg2_10_ComputeChange {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Input Money: ");
        double money = input.nextDouble();
        System.out.println("");

        int remainingAmount = (int)(money * 100);

        int dollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int quarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int dimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int nickles = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int pennies = remainingAmount;

        System.out.println("Your Amount is: " + money);
        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickles: " + nickles);
        System.out.println("Pennies: " + pennies);
    }
}
