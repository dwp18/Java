package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/20/2017.
 */
public class Ex3_18_CostOfShipping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the package weight (pounds): ");
        int weight = input.nextInt();

        double cost = 0;

        if (weight > 20) {
            System.out.println("overweight: the package cannot be shipped");
        } else {
            if (weight <= 1) {
                cost = 3.5;
            } else if (weight <= 3) {
                cost = 5.5;
            } else if (weight <= 10) {
                cost = 8.5;
            } else {
                cost = 10.5;
            }

            System.out.println("Your package weight is " + weight + " pounds and the shipping cost is $" + cost);
        }
    }
}
