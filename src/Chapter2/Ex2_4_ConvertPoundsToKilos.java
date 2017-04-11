package Chapter2;
import java.util.Scanner;

/**
 * Created by Wahyu on 4/11/2017.
 */
public class Ex2_4_ConvertPoundsToKilos {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        double kilos = pounds * 0.454;

        System.out.print(pounds + " pounds is " + kilos + " kilograms");

    }
}
