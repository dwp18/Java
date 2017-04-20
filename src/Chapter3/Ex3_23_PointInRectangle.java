package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/20/2017.
 */
public class Ex3_23_PointInRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point of two coordinates: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        boolean hDistance = x2 <= (10.0 / 2);
        boolean vDistance = y2 <= (5.0 / 2);

        if(hDistance && vDistance){
            System.out.print("Point (" + x2 + ", " + y2 + ") is in the rectangle");
        } else{
            System.out.print("Point (" + x2 + ", " + y2 + ") is not in the rectangle");
        }
    }
}
