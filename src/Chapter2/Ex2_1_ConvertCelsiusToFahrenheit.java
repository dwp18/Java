package Chapter2;
import java.util.Scanner;

/**
 * Created by Wahyu on 4/11/2017.
 */
public class Ex2_1_ConvertCelsiusToFahrenheit {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: " );
        int Celsius = input.nextInt();

        double Fahrenheit = (9.0 / 5.0) * (double)Celsius + 32;

        System.out.print(Celsius + " Celsius is " + Fahrenheit + " Fahrenheit");
    }
}
