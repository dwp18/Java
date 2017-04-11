package Chapter2;
import java.util.Scanner;

/**
 * Created by Wahyu on 4/11/2017.
 */
public class Ex2_16_HexagonArea {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side:g ");
        double side = input.nextDouble();

        double area = (3 * Math.pow(3, 0.5) / 2 * Math.pow(side, 2));

        System.out.print("The area of the hexagon is " + area);
    }
}
