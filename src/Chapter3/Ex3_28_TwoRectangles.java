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


        // Rectangle 1 edges coordinate
        double r1UpperRightX = x1 + (width1 / 2);
        double r1UpperRightY = y1 + (height1 / 2);
        double r1LowerRightX = x1 + (width1 / 2);
        double r1LowerRightY = y1 - (height1 / 2);
        double r1UpperLeftX = x1 - (width1 / 2);
        double r1UpperLeftY = y1 + (height1 / 2);
        double r1LowerLeftX = x1 - (width1 / 2);
        double r1LowerLeftY = y1 - (height1 / 2);


        // Distance between center of two rectangles
        double rectangleDistance = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 0.5);


        // Rectangle 2 edges coordinate
        double r2UpperRightX = x2 + (width2 / 2);
        double r2UpperRightY = y2 + (height2 / 2);
        double r2LowerRightX = x2 + (width2 / 2);
        double r2LowerRightY = y2 - (height2 / 2);
        double r2UpperLeftX = x2 - (width2 / 2);
        double r2UpperLeftY = y2 + (height2 / 2);
        double r2LowerLeftX = x2 - (width2 / 2);
        double r2LowerLeftY = y2 - (height2 / 2);


        // Check rectangle 2 edges are inside rectangle 1 edges or not
        boolean R1FromR2UpperLeft = r2UpperLeftX >= r1UpperLeftX && r2UpperLeftY <= r1UpperLeftY;
        boolean R1FromR2UpperRight = r2UpperRightX <= r1UpperRightX && r2UpperRightY <= r1UpperRightY;
        boolean R1FromR2LowerLeft = r2LowerLeftX >= r1LowerLeftX && r2LowerLeftY >= r1LowerLeftY;
        boolean R1FromR2LowerRight = r2LowerRightX <= r1LowerRightX && r2LowerRightY >= r1LowerRightY;
        boolean edgeInside = R1FromR2UpperLeft && R1FromR2UpperRight && R1FromR2LowerLeft && R1FromR2LowerRight;


        // Check rectangle 1 edges are inside rectangle 2 edges or not
        boolean R2FromR1UpperLeft = r1UpperLeftX >= r2UpperLeftX && r1UpperLeftY <= r2UpperLeftY;
        boolean R2FromR1UpperRight = r1UpperRightX <= r2UpperRightX && r1UpperRightY <= r2UpperRightY;
        boolean R2FromR1LowerLeft = r1LowerLeftX >= r2LowerLeftX && r1LowerLeftY >= r2LowerLeftY;
        boolean R2FromR1LowerRight = r1LowerRightX <= r2LowerRightX && r1LowerRightY >= r2LowerRightY;
        boolean edgeInsideReverse = R2FromR1UpperLeft && R2FromR1UpperRight && R2FromR1LowerLeft && R2FromR1LowerRight;


        // Check distance between rectangle 1's center with rectangle 2's center
        boolean centerDistance1 = x2 < (x1 + width1 / 2) || y2 < (y1 + height1 / 2);
        boolean centerDistance2 = x2 > (x1 - width1 / 2) || y2 > (y1 - height1 / 2);
        boolean centerInside = centerDistance1 && centerDistance2;


        // Check the distance between rectangle 2 and 1
        // is smaller than half of both rectangle's width/height or not
        boolean distance = rectangleDistance <= ((width1 / 2) + (width2 / 2)) || rectangleDistance <= ((height1 / 2) + (height2 / 2));


        // Display
        if (edgeInside ^ centerInside || edgeInsideReverse || distance) {
            System.out.println("r2 overlaps r1");
        } else if (edgeInside) {
            System.out.println("r2 is inside r1");
        } else {
            System.out.println("r2 does not overlaps r1");
        }
    }
}
