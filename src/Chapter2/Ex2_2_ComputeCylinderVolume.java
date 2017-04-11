package Chapter2;
import java.util.Scanner;
/**
 * Created by Wahyu on 4/11/2017.
 */
public class Ex2_2_ComputeCylinderVolume {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        System.out.println("");

        double currentArea = (int)(Math.PI * Math.pow(radius, 2) * 10000);
        double area = currentArea / 10000;
        double currentvolume = Math.round((area * length)*10);
        double volume = currentvolume / 10;

        System.out.print("The area is: " + area);
        System.out.println("");
        System.out.print("The volume is: " + volume);
    }
}
