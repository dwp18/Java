package Chapter2;
import java.util.Scanner;

/**
 * Created by Wahyu on 4/11/2017.
 */
public class Ex2_3_ConvertFeetToMeter {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for feet: ");
        double feet = input.nextDouble();
        System.out.println("");

        double meters = feet * 0.305;

        System.out.print(feet + " feet is " + meters + " meters");
    }
}
