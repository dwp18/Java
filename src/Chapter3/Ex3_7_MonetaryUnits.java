package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/18/2017.
 */
public class Ex3_7_MonetaryUnits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Money: ");
        double money = input.nextDouble();

        System.out.print("");//new line

        int remainingMoney=  (int)(money * 100);

        int dollars = remainingMoney / 100;
        remainingMoney = remainingMoney % 100;

        int quarters = remainingMoney / 25;
        remainingMoney = remainingMoney % 25;

        int dimes = remainingMoney / 10;
        remainingMoney = remainingMoney % 10;

        int nickles = remainingMoney / 5;
        remainingMoney = remainingMoney % 5;

        int pennies = remainingMoney;

        System.out.println("Your amount " + money + " consist of");
        if (dollars == 1){
            System.out.println(dollars + " dollar");
        } else {
            System.out.println(dollars + " dollars");
        }if (quarters == 1){
            System.out.println(quarters + " quarter");
        } else {
            System.out.println(quarters + " quarters");
        }if (dimes == 1){
            System.out.println(dimes + " dime");
        } else {
            System.out.println(dimes + " dimes");
        }if (nickles == 1){
            System.out.println(nickles + " nickle");
        } else {
            System.out.println(nickles + " nickles");
        }if (pennies == 1){
            System.out.println(pennies + " penny");
        } else {
            System.out.println(pennies + " pennies");
        }
    }
}
