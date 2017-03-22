package Chapter1;

/**
 * Created by Wahyu on 3/22/2017.
 */
public class Ex1_13_AlgebraLinearEquations {
    public static void main(String[] args){
        System.out.println("| 3.4 50.2 | = 44.5");
        System.out.println("| 2.1 0.55 | = 5.9");
        System.out.println("");

        System.out.print("D = ");
        System.out.println((3.4 * 0.55) - (2.1 * 50.2));
        System.out.println("");

        System.out.println("| 44.5 50.2 |");
        System.out.println("| 5.9  0.55 |");
        System.out.println("");

        System.out.print("Dx = ");
        System.out.println((44.5 * 0.55) - (5.9 * 50.2));
        System.out.println("");

        System.out.println("     Dx");
        System.out.print("x = --- = ");
        System.out.println(((44.5 * 0.55) - (5.9 * 50.2)) / ((3.4 * 0.55) - (2.1 * 50.2)));
        System.out.println("     D");
        System.out.println("");

        System.out.println("        3.4x + 50.2y = 44.5");
        System.out.println("3.4 (2.6239) + 50.2y = 44.5");
        System.out.print("     ");
        System.out.print(3.4 * 2.6239);
        System.out.println(" + 50.2y = 44.5");
        System.out.println("               50.2y = 44.5 - 8.92126");
        System.out.print("               50.2y = ");
        System.out.println(44.5 - 8.92126);
        System.out.println("                   y = 35.5787 / 50.2");
        System.out.print("                   y = ");
        System.out.print(35.5787 / 50.2);
    }
}
