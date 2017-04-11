package Chapter2;
import java.util.Scanner;

/**
 * Created by Wahyu on 4/11/2017.
 */
public class Ex2_11_PopulationProjection {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        int currentPopulations = 312032486;
        int totalDays = years * 365;
        int totalHours = totalDays * 24;
        int totalMinutes = totalHours * 60;
        int totalSeconds = totalMinutes * 60;

        int birthProjection = totalSeconds / 7;
        int deathProjection = totalSeconds / 13;
        int immigrantProjection = totalSeconds / 45;

        int totalProjections = birthProjection - deathProjection + immigrantProjection;

        int population = currentPopulations + totalProjections;

        System.out.print("The population in " + years + " years is " + population);
    }
}
