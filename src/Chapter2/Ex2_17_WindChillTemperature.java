package Chapter2;
import java.util.Scanner;

/**
 * Created by Wahyu on 4/11/2017.
 */
public class Ex2_17_WindChillTemperature {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
        double fahrenheit = input.nextDouble();

        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double windSpeed = input.nextDouble();

        double wci = 35.74 + (0.6215 * fahrenheit) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * fahrenheit * Math.pow(windSpeed, 0.16));

        System.out.print("The wind chill index is " + wci);
    }
}
