package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/20/2017.
 */
public class Ex3_27_PointsOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        double a = 100;
        double b = 200;
        double c = Math.pow((Math.pow(a, 2) + Math.pow(b, 2)), 0.5);

        System.out.println(c);

        double area = a * b / 2;

        double diagonalHeight = area * 2 / c;

        System.out.println(diagonalHeight);*/

        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        //boolean vDistance = y < 0 && y > 100;
        //boolean hDistance = x < 0 && x > 200;

        boolean vDistance = x > 0;
        boolean hDistance = y > 0;
        boolean dDistance = x + (2 * y) <= 200;

        if (hDistance && vDistance && dDistance){
            System.out.print("The point is in the triangle");
        } else {
            System.out.print("The point is not in the triangle");
        }
    }
}
