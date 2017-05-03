package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/21/2017.
 */
public class Ex3_28_TwoRectangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter r1's center x-, y-coordinates, width, height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double width1 = input.nextDouble();
        double height1 = input.nextDouble();

        System.out.print("Enter r2's center x-, y-coordinates, width, height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double width2 = input.nextDouble();
        double height2 = input.nextDouble();

        double r1UpperRightX = x1 + (width1 / 2);
        double r1UpperRightY = y1 + (height1 / 2);
        double r1LowerRightX = x1 + (width1 / 2);
        double r1LowerRightY = y1 - (height1 / 2);
        double r1UpperLeftX = x1 - (width1 / 2);
        double r1UpperLeftY = y1 + (height1 / 2);
        double r1LowerLeftX = x1 - (width1 / 2);
        double r1LowerLeftY = y1 - (height1 / 2);

        double r2UpperRightX = x2 + (width2 / 2);
        double r2UpperRightY = y2 + (height2 / 2);
        double r2LowerRightX = x2 + (width2 / 2);
        double r2LowerRightY = y2 - (height2 / 2);
        double r2UpperLeftX = x2 - (width2 / 2);
        double r2UpperLeftY = y2 + (height2 / 2);
        double r2LowerLeftX = x2 - (width2 / 2);
        double r2LowerLeftY = y2 - (height2 / 2);
        System.out.println("");

        /*Debugging
        System.out.println("Rectangle 1 Coordinate ");
        System.out.println("Upper Left Point " + r1UpperLeftX + "," + r1UpperLeftY);
        System.out.println("Upper Right Point " + r1UpperRightX + "," + r1UpperRightY);
        System.out.println("Lower Left Point " + r1LowerLeftX + "," + r1LowerLeftY);
        System.out.println("Lower Right Point " + r1LowerRightX + "," + r1LowerRightY);
        System.out.println("");

        System.out.println("Rectangle 2 Coordinate ");
        System.out.println("Upper Left Point " + r2UpperLeftX + "," + r2UpperLeftY);
        System.out.println("Upper Right Point " + r2UpperRightX + "," + r2UpperRightY);
        System.out.println("Lower Left Point " + r2LowerLeftX + "," + r2LowerLeftY);
        System.out.println("Lower Right Point " + r2LowerRightX + "," + r2LowerRightY);
        System.out.println("");
        */

        boolean p1Distance = r2UpperLeftX >= r1UpperLeftX && r2UpperLeftY <= r1UpperLeftY;
        boolean p2Distance = r2UpperRightX <= r1UpperRightX && r2UpperRightY <= r1UpperRightY;
        boolean p3Distance = r2LowerLeftX >= r1LowerLeftX && r2LowerLeftY >= r1LowerLeftY;
        boolean p4Distance = r2LowerRightX <= r1LowerRightX && r2LowerRightY >= r1LowerRightY;
        boolean centerDistance1 = x2 < (x1 + width1 / 2) || y2 < (y1 + height1 / 2);
        boolean centerDistance2 = x2 > (x1 - width1 / 2)|| y2 > (y1 - height1 / 2);

        /*Debugging
        System.out.println(p1Distance);
        System.out.println(p2Distance);
        System.out.println(p3Distance);
        System.out.println(p4Distance);
        System.out.println(centerDistance1);
        System.out.println(centerDistance2);
        */
        if (p1Distance && p2Distance && p3Distance && p4Distance) {
            System.out.println("r2 is inside r1");
        } else if (centerDistance1 && centerDistance2){
            System.out.println("r2 overlaps r1");
        } else {
            System.out.println("r2 does not overlaps r1");
        }
    }
}
