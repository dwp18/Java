package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 05/05/2017.
 */
public class Ex3_33_CompareCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();

        System.out.print("Enter the weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        double value1 = price1 / weight1;
        double value2 = price2 / weight2;

        if (value1 > value2){
            System.out.print("Package 2 has a better price");
        } else if (value1 < value2){
            System.out.print("Package 1 has a better price");
        } else {
            System.out.print("Two package have the same price");
        }
    }
}
