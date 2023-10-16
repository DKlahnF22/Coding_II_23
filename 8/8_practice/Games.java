
import java.util.ArrayList;
import java.util.Random;
public class Games {
    public static ArrayList<Games> games = new ArrayList<Games>();
    //fields
    Random Random = new Random();
   private String homeTeam;
   private String awayTeam;
   private int teamScore1;
   private int teamScore2;
   private double temperature;
    private int gameNum = 0;
    //constructor
    public Games(double temperature){
        
        this.temperature = temperature;
        //gets two different numbers 0 - 3 to choose teams, makes sure the numbers aren't the same
        int teamOne = Random.nextInt(4);
        int teamOneScore = 0;
        int teamTwo = Random.nextInt(4);
        int teamTwoScore = 0;
        while (teamOne == teamTwo){
        teamTwo = Random.nextInt(3);
        }
        //this section assigns the selected teams to the game's variables and begins updating the teams
        this.homeTeam = Teams.teams.get(teamOne).getName();
        this.awayTeam = Teams.teams.get(teamTwo).getName();
        //sets the score
        if(temperature > 90){
            Teams.teams.get(teamOne).setGoalTotal(teamOneScore = Random.nextInt(10));
            Teams.teams.get(teamTwo).setGoalTotal(teamTwoScore = Random.nextInt(10));
        } else if (temperature > 80){
            Teams.teams.get(teamOne).setGoalTotal(teamOneScore = Random.nextInt(8));
            Teams.teams.get(teamTwo).setGoalTotal(teamTwoScore = Random.nextInt(8));
        } else if (temperature > 70){
            Teams.teams.get(teamOne).setGoalTotal(teamOneScore = Random.nextInt(6));
            Teams.teams.get(teamTwo).setGoalTotal(teamTwoScore = Random.nextInt(6));
        } else {
            Teams.teams.get(teamOne).setGoalTotal(teamOneScore = Random.nextInt(4));
            Teams.teams.get(teamTwo).setGoalTotal(teamTwoScore = Random.nextInt(4));
        }
        //System.out.println("Team one goal total: " + Teams.teams.get(teamOne).getGoalTotal());
        //System.out.println("Team two goal total: " + Teams.teams.get(teamTwo).getGoalTotal());
        //settings the goals allowed for each side
        Teams.teams.get(teamOne).setGoalAllowed(teamTwoScore);
        Teams.teams.get(teamTwo).setGoalAllowed(teamOneScore);
        //System.out.println("Team one allowed goals: " + Teams.teams.get(teamOne).getGoalAllowed());
        //System.out.println("Team two allowed goals: " + Teams.teams.get(teamTwo).getGoalAllowed());
        //decides who actually won the game
        if(teamOneScore > teamTwoScore){
            Teams.teams.get(teamOne).setWinTotal(1);
            Teams.teams.get(teamTwo).setLossTotal(1);
        } else if (teamOneScore == teamTwoScore){
            Teams.teams.get(teamOne).setTieTotal(1);
            Teams.teams.get(teamTwo).setTieTotal(1);
        } else {
            Teams.teams.get(teamTwo).setWinTotal(1);
            Teams.teams.get(teamOne).setLossTotal(1);
        }
        //System.out.println("Team one win total: " + Teams.teams.get(teamOne).getwinTotal());
        //System.out.println("Team two win total: " + Teams.teams.get(teamTwo).getwinTotal());
        //this section does it for the other half of the game
        teamOne = Random.nextInt(4);
        teamTwo = Random.nextInt(4);
        teamOneScore = 0;
        teamTwoScore = 0;
        //makes sure the same teams don't go against eachother
        while(teamOne == teamTwo){
            teamTwo = Random.nextInt(3);
        }
        this.homeTeam += ", " + Teams.teams.get(teamOne).getName();
        this.homeTeam += ", " + Teams.teams.get(teamTwo).getName();
        //sets the scores for the other teams
        if(temperature > 90){
            Teams.teams.get(teamOne).setGoalTotal(teamOneScore = Random.nextInt(10));
            Teams.teams.get(teamTwo).setGoalTotal(teamTwoScore = Random.nextInt(10));
        } else if (temperature > 80){
            Teams.teams.get(teamOne).setGoalTotal(teamOneScore = Random.nextInt(8));
            Teams.teams.get(teamTwo).setGoalTotal(teamTwoScore = Random.nextInt(8));
        } else if (temperature > 70){
            Teams.teams.get(teamOne).setGoalTotal(teamOneScore = Random.nextInt(6));
            Teams.teams.get(teamTwo).setGoalTotal(teamTwoScore = Random.nextInt(6));
        } else {
            Teams.teams.get(teamOne).setGoalTotal(teamOneScore = Random.nextInt(4));
            Teams.teams.get(teamTwo).setGoalTotal(teamTwoScore = Random.nextInt(4));
        }
        //sets the allowed goals for each time
        Teams.teams.get(teamOne).setGoalAllowed(teamTwoScore);
        Teams.teams.get(teamTwo).setGoalAllowed(teamOneScore);
        //decides who wins the game
        if(teamOneScore > teamTwoScore){
            Teams.teams.get(teamOne).setWinTotal(1);
            Teams.teams.get(teamTwo).setLossTotal(1);
        } else if (teamOneScore == teamTwoScore){
            Teams.teams.get(teamOne).setTieTotal(1);
            Teams.teams.get(teamTwo).setTieTotal(1);
        } else {
            Teams.teams.get(teamTwo).setWinTotal(1);
            Teams.teams.get(teamOne).setLossTotal(1);
        }
        games.add(this);
        System.out.println("Game number: " + gameNum);
    }
    //getters
    public String getHomeTeam() {
        return homeTeam;
    }
    public String getAwayTeam() {
        return awayTeam;
    }
    public int getTeamScore1() {
        return teamScore1;
    }
    public int getTeamScore2() {
        return teamScore2;
    }
    public double getTemperature() {
        return temperature;
    }
    public int getGameNum() {
        return gameNum;
    }
    //setters
    public void setHomeTeam(String teamName1) {
    this.homeTeam = teamName1;
    }
    public void setAwayTeam(String teamName2) {
    this.awayTeam = teamName2;
    }
    public void setTeamScore1(int teamScore1) {
    this.teamScore1 = teamScore1;
    }
    public void setTeamScore2(int teamScore2) {
    this.teamScore2 = teamScore2;
    }
    public void setTemperature(double temperature) {
    this.temperature = temperature;
    }
    public void setGameNum(int i){
        gameNum =+ i;
    }
}
