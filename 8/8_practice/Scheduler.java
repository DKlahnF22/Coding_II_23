
import java.util.InputMismatchException;
import java.util.Scanner;
public class Scheduler {
    public void startSeason(){
        Scanner sc = new Scanner(System.in);
        int winterCheck = 0;
        //creating teams
        Teams team1 = new Teams("The Googlers", 0, 0, 0, 0, 0);
        Teams team2 = new Teams("The duster busters", 0, 0, 0, 0, 0);
        Teams team3 = new Teams("I love you more", 0, 0, 0, 0, 0);
        Teams team4 = new Teams("Lazy losers", 0, 0, 0, 0, 0);
        //this checks temperature and checks for winter
        while(winterCheck != 3){
            System.out.println("Please input the estimated temperature of the week in fahrenheit, in number form. Decimal included.");
            try{
                double temperature = sc.nextDouble();
                if(temperature >= 32.0){
                    Games firstSeason = new Games(temperature);
                    winterCheck = 0;
                    System.out.println(winterCheck);
                    System.out.println("It is warm enough to play.");
                } else {
                    System.out.println("Too cold to play.");
                    winterCheck += 1;
                    System.out.println(winterCheck);
                }
            }
            catch(InputMismatchException e){
                System.out.println("Invalid input");
                sc.next();
            }
        }
        for(int i = 0; i < 4; i++){
            System.out.println(Teams.teams.get(i).getName());
            System.out.println("Wins: " + (Teams.teams.get(i).getwinTotal()) + ", Losses: " + (Teams.teams.get(i).getLossTotal()) + ", Ties: " + (Teams.teams.get(i).getTieTotal()));
            System.out.println("Points Scored: " + (Teams.teams.get(i).getGoalTotal()) + ", Points Allowed: " + (Teams.teams.get(i).getGoalAllowed()));
            System.out.println("");
        }

        sc.close();
    }
}