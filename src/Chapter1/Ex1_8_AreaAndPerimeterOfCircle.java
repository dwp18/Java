package Chapter1;

/**
 * Created by Wahyu on 3/22/2017.
 */
public class Ex1_8_AreaAndPerimeterOfCircle {
    public static void main(String[] args){
        System.out.println("Known    : Radius = 5.5");
        System.out.println("Question : How board the area and how big the perimeter of a circle is?");
        System.out.println("");
        System.out.println("Perimeter = 2 x radius x Pi");
        System.out.println("          = 2 x 5.5 x 3.14");
        System.out.print("          = ");
        System.out.println(2 * 5.5 * Math.PI);

        System.out.println("");
        System.out.println("Area = radius x radius x Pi");
        System.out.println("     = 5.5 x 5.5 x 3.14");
        System.out.print("     = ");
        System.out.println(5.5 * 5.5 * Math.PI);
    }
}
