package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/18/2017.
 */
public class Ex3_1_SolveQuadraticEquations {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.print("Enter a, b , c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b,2) - (4 * a * c);

        double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
        double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);

        double sixDecimalR1 = (int)(r1 * 1000000);
        double sixDecimalR2 = (int)(r2 * 1000000);

        r1 = sixDecimalR1 / 1000000;
        r2 = sixDecimalR2 / 1000000;

        /*
        DEBUGGING
        System.out.println("Discriminant is " + discriminant);
        System.out.println("Root 1 is " + r1);
        System.out.println("Root 2 is " + r2);
        */

        if (discriminant >= 1.0){
            System.out.print("The Equation has two roots " + r1 + " and " + r2);
        } else if (discriminant == 0) {
            System.out.print("The Equation has one root " + (int)r1);
        } else {
            System.out.print("The Equation has no real roots");
        }



    }
}
