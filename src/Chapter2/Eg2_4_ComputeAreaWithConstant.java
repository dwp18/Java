package Chapter2;
import java.util.Scanner;

/**
 * Created by Wahyu on 3/22/2017.
 */
public class Eg2_4_ComputeAreaWithConstant {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        double area = radius * radius * PI;

        System.out.print("The area of the circle radius " + radius + " is " + area);
    }
}
