package Chapter1;

/**
 * Created by Wahyu on 3/22/2017.
 */
public class Ex1_10_AverageSpeedInMiles {
    public static void main(String[] args){
        System.out.println("Runner runs 14 kilometers in 45 minutes and 30 seconds");
        System.out.println("Display the average speen in miles per hour");
        System.out.println("");

        System.out.println("1 miles =  1.6 kilometers ");
        System.out.print("14 kilometers = ");
        System.out.print(14 / 1.6);
        System.out.println(" miles");
        System.out.println("");

        System.out.println("1 hour =  60 minutes");
        System.out.println("1 minutes = 60 seconds");
        System.out.print("1 hour = ");
        System.out.print(60 * 60);
        System.out.println(" seconds");
        System.out.print("45 minutes = ");
        System.out.print(45 * 60);
        System.out.println(" seconds");
        System.out.println("");

        System.out.print("45 minutes and 30 seconds = ");
        System.out.print("2730 seconds / 3600 seconds = ");
        System.out.print(2730.0 / 3600.0);
        System.out.println(" hour");
        System.out.println("");

        System.out.print("Runner average speed is = ");
        System.out.print("8.75 miles / 0.7583 hour = ");
        System.out.print(8.75 / 0.7583);
        System.out.print(" miles/hour");
    }
}
