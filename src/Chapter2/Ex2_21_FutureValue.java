package Chapter2;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/11/2017.
 */
public class Ex2_21_FutureValue {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the investment amount: ");
        double investment = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double interest = input.nextDouble();
        double monthlyInterest = 1 + interest / 1200;

        System.out.print("Enter number of years: ");
        double years = input.nextDouble();

        double futureValue = investment * Math.pow(monthlyInterest, years * 12);

        System.out.print("Accumulated value is $ " + futureValue);
    }
}
