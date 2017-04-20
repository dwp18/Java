package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/20/2017.
 *
 * (Science: wind-chill temperature) Programming Exercise 2.17 gives a formula
 to compute the wind-chill temperature. The formula is valid for temperatures in
 the range between −58ºF and 41ºF and wind speed greater than or equal to 2.
 Write a program that prompts the user to enter a temperature and a wind speed.
 The program displays the wind-chill temperature if the input is valid; otherwise,
 it displays a message indicating whether the temperature and/or wind speed is
 invalid.
 */
public class Ex3_20_WindChillTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
        double temperature = input.nextDouble();

        System.out.print("Enter the the wind speed (>=2) in miles per hour: ");
        int windSpeed = input.nextInt();

        double windSpeedRoot = Math.pow(windSpeed, 0.16);

        if (temperature <= -57 || temperature >= 42 || windSpeed < 2){
            System.out.println("You input the wrong temperature or wind speed");
        } else {
            double wc = 35.74 + 0.6215 * temperature - 35.75 * windSpeedRoot + 0.4275 * temperature * windSpeedRoot;
            System.out.println("The wind chill index is " + wc);
        }
    }
}
