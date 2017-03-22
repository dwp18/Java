package Chapter1;

/**
 * Created by Wahyu on 3/22/2017.
 */
public class Ex1_7_ApproximatePi {
    public static void main (String[] agrs){
        System.out.println("                1     1     1     1     1");
        System.out.print("Pi = 4 x ( 1 - --- + --- - --- + --- - --- ) = ");
        System.out.println(4 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
        System.out.println("                3     5     7     9     11");

        System.out.println("");
        System.out.println("                1     1     1     1     1     1");
        System.out.print("Pi = 4 x ( 1 - --- + --- - --- + --- - --- + --- ) = ");
        System.out.println(4 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13)));
        System.out.println("                3     5     7     9     11    13");

    }
}
