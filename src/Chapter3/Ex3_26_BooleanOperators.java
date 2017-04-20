package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/20/2017.
 */
public class Ex3_26_BooleanOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        boolean and = (number % 5 == 0) && (number % 6 == 0);
        boolean or = (number % 5 == 0) || (number % 6 == 0);
        boolean xor = (number % 5 == 0) ^ (number % 6 == 0);

        System.out.println("Is " + number + " divisible by 5 and 6? " + and);
        System.out.println("Is " + number + " divisible by 5 or 6? " + or);
        System.out.println("Is " + number + " divisible by 5 and 6, but not both? " + xor);
    }
}
