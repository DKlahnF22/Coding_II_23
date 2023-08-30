import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random randomNumber = new Random();
        int computerNumber = randomNumber.nextInt(3);
        int playerChoice;
        System.out.println("Greetings, it is I once again. R.A.I.N.");
        System.out.println("I wish to play a game of rock, paper, and scissors.");
        System.out.println("Choose now one of the three via number.");
        System.out.println("Zero for rock, one for paper, and two for scissors.");
        playerChoice = sc.nextInt();
        //comparison
        if (computerNumber == playerChoice){

        }




    }
}