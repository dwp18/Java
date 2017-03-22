package Chapter2;
import java.util.Scanner;
/**
 * Created by Wahyu on 3/22/2017.
 */
public class Eg2_2_ComputeAreaWithConsoleInput {
    public static void main(String[] args){
        //Create Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        //Compute Area
        double area = radius * radius * Math.PI;

        //Display Result
        System.out.print("The Area of radius of " + radius + " is " + area);
    }
}
