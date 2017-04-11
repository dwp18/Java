package Chapter2;


import java.util.Scanner;

/**
 * Created by Wahyu on 4/11/2017.
 */
public class Ex2_19_TriangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points of Triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double x1Square = Math.pow(x2 - x1, 2);
        double y1Square = Math.pow(y2 - y1, 2);

        double x2Square = Math.pow(x3 - x2, 2);
        double y2Square = Math.pow(y3 - y2, 2);

        double x3Square = Math.pow(x1 - x3, 2);
        double y3Square = Math.pow(y1 - y3, 2);

        double side1 = Math.pow((x1Square + y1Square), 0.5);
        double side2 = Math.pow((x2Square + y2Square), 0.5);
        double side3 = Math.pow((x3Square + y3Square), 0.5);

        double s = (side1 + side2 + side3) / 2;

        double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);

        System.out.print("The area of the triangle is " + area);
    }
}