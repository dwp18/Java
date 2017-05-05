package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 05/05/2017.
 */
public class Ex3_31_CurrencyExchange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();

        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int converter = input.nextInt();

        if (converter == 0) {
            System.out.print("Enter the dollar amount: ");
            double dollar = input.nextDouble();
            System.out.println("$" + dollar + " is " + dollar * exchangeRate + " yuan");
        } else if (converter == 1) {
            System.out.print("Enter the RMB amount: ");
            double RMB = input.nextDouble();
            System.out.println(RMB + " yuan is " + RMB / exchangeRate + " yuan");
        } else {
            System.out.print("You input the wrong option");
        }

    }
}
