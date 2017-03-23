package Chapter2;
import java.util.Scanner;

/**
 * Created by Wahyu on 3/23/2017.
 */
public class Eg2_6_FahrenheitToCelsius {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Input degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (5.0 / 9.0) * (fahrenheit - 32);

        System.out.print(fahrenheit + " Fahrenheit equals " + celsius + " Celsius");
    }
}
