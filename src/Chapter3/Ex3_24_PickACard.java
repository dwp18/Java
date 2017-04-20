package Chapter3;

/**
 * Created by Wahyu on 4/20/2017.
 */
public class Ex3_24_PickACard {
    public static void main(String[] args) {

        int rank = (int)(Math.random() * 13) + 1;
        int suit = (int)(Math.random() * 4) + 1;

        System.out.println(rank); //DEBUGGING

        switch(rank){
            case 1 : System.out.print("The card you pick is Ace of"); break;
            case 2 : System.out.print("The card you pick is 2 of"); break;
            case 3 : System.out.print("The card you pick is 3 of"); break;
            case 4 : System.out.print("The card you pick is 4 of"); break;
            case 5 : System.out.print("The card you pick is 5 of"); break;
            case 6 : System.out.print("The card you pick is 6 of"); break;
            case 7 : System.out.print("The card you pick is 7 of"); break;
            case 8 : System.out.print("The card you pick is 8 of"); break;
            case 9 : System.out.print("The card you pick is 9 of"); break;
            case 10 : System.out.print("The card you pick is 10 of"); break;
            case 11 : System.out.print("The card you pick is Jack of"); break;
            case 12 : System.out.print("The card you pick is Quenn of"); break;
            case 13 : System.out.print("The card you pick is King of"); break;
        }

        switch(suit){
            case 1 : System.out.print(" Clubs"); break;
            case 2 : System.out.print(" Diamonds"); break;
            case 3 : System.out.print(" Hearts"); break;
            case 4 : System.out.print(" Spades"); break;
        }
    }
}
