public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
        double mEggs = 100.0;
        double tEggs = 121.0;
        double wEggs = 117.0;
        double pEgg = 0.18;
        double dailyAverage = (mEggs + tEggs + wEggs) / 3;
        double monthlyAverage = (dailyAverage * 30);
        double monthlyProfit = monthlyAverage * pEgg;
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
