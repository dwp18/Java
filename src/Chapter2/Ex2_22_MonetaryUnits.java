package Chapter2;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/11/2017.
 */
public class Ex2_22_MonetaryUnits {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Input money: ");
        int money = input.nextInt();

        int dollars = money / 100;
        int currentMoney = money % 100;

        int quarters = currentMoney / 25;
        currentMoney = currentMoney % 25;

        int dimes = currentMoney / 10;
        currentMoney = currentMoney % 10;

        int nickles = currentMoney / 5;
        currentMoney = currentMoney % 5;

        int pennies = currentMoney;

        System.out.println("Your money is " + (double)money / 100);
        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickles: " + nickles);
        System.out.println("Pennies: " + pennies);
    }
}
