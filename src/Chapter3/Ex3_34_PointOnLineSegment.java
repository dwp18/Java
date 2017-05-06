package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 05/05/2017.
 */
public class Ex3_34_PointOnLineSegment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Calculate distance between points
        double P0ToP1Distance = Math.pow(Math.pow((x1 - x0), 2) + Math.pow((y1 - y0), 2), 0.5);
        double P2ToP0Distance = Math.pow(Math.pow((x2 - x0), 2) + Math.pow((y2 - y0), 2), 0.5);
        double P2ToP1Distance = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 0.5);


        // Check point 2
        // is on the line with point 0 and 1 or not
        boolean isOnTheLine = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0;

        // Check both distance from point 2 to other points
        // is less than to equal to point 0 and 1 distance
        boolean isOnTheLine2 = P2ToP0Distance <= P0ToP1Distance && P2ToP1Distance <= P0ToP1Distance;


        // Display
        if (isOnTheLine && isOnTheLine2) {
            System.out.print("(" + x2 + "," + y2 + ") is on the line segment from " + "(" + x0 + "," + y0 + ") to " + "(" + x1 + "," + y1 + ")");
        } else {
            System.out.print("(" + x2 + "," + y2 + ") is not on the line segment from " + "(" + x0 + "," + y0 + ") to " + "(" + x1 + "," + y1 + ")");
        }
    }
}
