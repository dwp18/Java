package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/20/2017.
 */
public class Ex3_17_ScissorRockPaper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ai = (int)(Math.random() * 3);

        System.out.println(ai);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int choice = input.nextInt();

        switch (ai){
            case 0 : System.out.print("The computer is scissor. "); break;
            case 1 : System.out.print("The computer is rock. "); break;
            case 2 : System.out.print("The computer is paper. "); break;
        }

        switch (choice){
            case 0 : System.out.print("You are scissor"); break;
            case 1 : System.out.print("You are rock"); break;
            case 2 : System.out.print("You are paper"); break;
        }

        if (ai == choice){
            System.out.print(" too. It is a draw");
        } else if ((choice == 1 && ai == 2) || (choice == 2 && ai == 0) || (choice == 0 && ai == 1)){
            System.out.print(". You lost");
        } else{
            System.out.print(". You won");
        }
    }
}
