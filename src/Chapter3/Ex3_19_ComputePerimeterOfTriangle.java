package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/20/2017.
 */
public class Ex3_19_ComputePerimeterOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input 3 size of triangle side: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        int trianglePerimeter = x + y + z;

        if (x + y < z || x + z < y || y + z < x){
            System.out.print("The input is invalid");
        } else {
            System.out.print("Perimeter of the triangle is " + trianglePerimeter);
        }
    }
}
