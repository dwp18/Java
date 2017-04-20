package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/20/2017.
 */
public class Ex3_22_PointInCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        int x1 = 0;
        int y1 = 0;

        double distance = Math.pow((Math.pow(x2 -x1, 2) + Math.pow(y2 - y1, 2)), 0.5);
        boolean distanceToCenter = distance <= 10;

        //System.out.println(distance); DEBUGGING

        if (distanceToCenter) {
            System.out.print("Point (" + x2 + ", " + y2 + ") is in the circle");
        } else {
            System.out.print("Point (" + x2 + ", " + y2 + ") is not in the circle");
        }
    }
}
