package Chapter2;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/11/2017.
 */
public class Ex2_20_CalculeInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double interest = input.nextDouble();

        double interestAmount = balance * (interest / 1200);

        System.out.print("The interest is " + interestAmount);
    }
}
