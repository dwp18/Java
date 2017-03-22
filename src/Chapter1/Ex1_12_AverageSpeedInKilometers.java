package Chapter1;

/**
 * Created by Wahyu on 3/22/2017.
 */
public class Ex1_12_AverageSpeedInKilometers {
    public static void main(String[] args){
        System.out.println("Runner runs 24 miles in 1 hour, 40 minutes, 35 seconds");
        System.out.print("Runner runs ");
        System.out.print(24.0 * 1.6);
        System.out.print(" kilometers in ");
        System.out.print((3600.0 + 2400.0 + 35.0) / 3600);
        System.out.println(" hour");
        System.out.println("");

        System.out.print("Runner average speed is ");
        System.out.print(38.4/1.6764);
        System.out.print(" kilometers/hour");
    }
}
