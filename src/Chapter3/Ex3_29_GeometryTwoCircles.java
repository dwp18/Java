package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 05/05/2017.
 */
public class Ex3_29_GeometryTwoCircles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();


        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();


        // Distance between center of two circles
        double circleDistance = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 0.5);


        // Validation
        boolean isInside = circleDistance < (r1 - r2);
        boolean isOverlap = circleDistance <= (r1 + r2);


        // Display
        if(isInside){
            System.out.print("circle2 is inside circle1");
        } else if(isOverlap){
            System.out.print("circle2 overlaps circle1");
        } else {
            System.out.print("circle2 doesn't overlaps circle1");
        }
    }
}
