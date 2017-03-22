package Chapter2;

/**
 * Created by Wahyu on 3/22/2017.
 */
public class Eg2_1_ComputeArea {
    public static void main(String[] args){
        double radius; //declare radius
        double area; //declare area

        //assign radius
        radius = 20;

        //compute area
        area = radius * radius * Math.PI;

        //display result
        System.out.print("The area for the circle " + radius + " is " + area);
    }
}
