public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        int totalEggs = 0;
        int eggsPerChicken = 4;
        int chickenCount = 8;
        totalEggs += chickenCount * eggsPerChicken;
        System.out.println(totalEggs);
        //Monday
        chickenCount++;
        totalEggs += chickenCount * eggsPerChicken;
        System.out.println(totalEggs);
        //Tuesday
        chickenCount = chickenCount / 2;
        totalEggs += chickenCount * eggsPerChicken;
        System.out.println(totalEggs);
        //Wednesday
    }   
}