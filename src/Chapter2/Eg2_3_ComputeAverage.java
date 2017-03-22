package Chapter2;
import java.util.Scanner;
/**
 * Created by Wahyu on 3/22/2017.
 */
public class Eg2_3_ComputeAverage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 numbers:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        double average = (num1 + num2 + num3) / 3;

        System.out.print("The average of " + num1 + " + " + num2 + " + " + num3 + " is " + average);
    }
}
