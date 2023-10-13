
import java.util.Random;
public class Games {
    //fields
    Random Random = new Random();
   private String teamName1;
   private String teamName2;
   private int teamScore1;
   private int teamScore2;
   private double temperature;
    private int gameNum = 0;
    //constructor
    public Games(){
        setGameNum(1);
        int i = Random.nextInt(3);
        //have an if statement checking if the team index is the same

    }
    //getters
    public String getTeamName1() {
        return teamName1;
    }
    public String getTeamName2() {
        return teamName2;
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
    public void setTeamName1(String teamName1) {
    this.teamName1 = teamName1;
    }
    public void setTeamName2(String teamName2) {
    this.teamName2 = teamName2;
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
