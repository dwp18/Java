package Chapter2;
import java.util.Scanner;

/**
 * Created by Wahyu on 4/11/2017.
 */
public class Ex2_15_DistanceOfPoints {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double xSquare = Math.pow(x2 - x1, 2);
        double ySquare = Math.pow(y2 - y1, 2);

        double distance = Math.pow((xSquare + ySquare), 0.5);

        System.out.print("The distance between two points is " + distance);
    }
}
