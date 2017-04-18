package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/18/2017.
 */
public class Ex3_3_Algebra2x2LinearEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double marker = (a * d - b * c);

        double x = (e * d - b * f) / marker;
        double y = (a * f - e * c) / marker;

        if (marker == 0){
            System.out.print("The equation has no solution");
        } else {
            System.out.print("x is " + x + " and y is " + y);
        }
    }
}
