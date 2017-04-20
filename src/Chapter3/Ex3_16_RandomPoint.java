package Chapter3;

/**
 * Created by Wahyu on 4/20/2017.
 */
public class Ex3_16_RandomPoint {
    public static void main(String[] args) {
        int x = (int)(Math.random() * 10);
        int y = (int)(Math.random() / 2 * 10);

        int x2 = x + 100;
        int y2 = y;

        int x3 = x;
        int y3 = y + 200;

        int x4 = x2;
        int y4 = y3;

        System.out.println("Coordinate 1: (" + x + "," + y + ")");
        System.out.println("Coordinate 2: (" + x2 + "," + y2 + ")");
        System.out.println("Coordinate 3: (" + x3 + "," + y3 + ")");
        System.out.println("Coordinate 4: (" + x4 + "," + y4 + ")");
    }
}
