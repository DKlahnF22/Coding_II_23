import java.util.ArrayList;
public class Teams {
    static ArrayList<Teams> teams = new ArrayList<Teams>(); 
    //fields
    private String teamName;
    private int winTotal;
    private int lossTotal;
    private int tieTotal;
    private int totalGoals;
    private int totalGoalsAllowed;
    public Teams (String teamName, int winTotal, int lossTotal, int tieTotal, int totalGoals, int totalGoalsAllowed){
        this.teamName = teamName;
        this.winTotal = winTotal;
        this.lossTotal = lossTotal;
        this.tieTotal =  tieTotal;
        this.totalGoals = totalGoals;
        this.totalGoalsAllowed = totalGoalsAllowed;
        teams.add(this);
    }
    //getters
    public String getName(){
        return teamName;
    }
    public int getwinTotal(){
        return winTotal;
    }
    public int getLossTotal(){
        return lossTotal;
    }
    public int getTieTotal(){
        return tieTotal;
    }
    public int getGoalTotal(){
        return totalGoals;
    }
    public int getGoalAllowed(){
        return totalGoalsAllowed;
    }
    //setters
    public void setWinTotal(int newWin){
        winTotal =+ newWin;
    }
    public void setLossTotal(int newLoss){
        lossTotal =+ newLoss;
    }
    public void setTieTotal(int newTie){
        tieTotal =+ newTie;
    }
    public void setGoalTotal(int newGoal){
        totalGoals =+ newGoal;
    }
    public void setGoalAllowed(int goalAllowed){
        totalGoalsAllowed = goalAllowed;
    }
}
