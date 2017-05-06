package Chapter4;

import java.util.Scanner;

/**
 * Created by Wahyu on 06/05/2017.
 */
public class Eg4_1_ComputeAngles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();


        // Calculate Sides
        double a = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        double b = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
        double c = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);


        // Calculate Angles
        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - c * c - a * a) / (-2 * c * a)));
        double C = Math.toDegrees(Math.acos((c * c - a * a - b * b) / (-2 * a * b)));

        // Display
        System.out.print("The three angles are " +
            Math.round(A * 100) / 100.0 + " " +
            Math.round(B * 100) / 100.0 + " " +
            Math.round(C * 100) / 100.0);
    }
}
