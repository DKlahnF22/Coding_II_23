import java.util.Random;


public class ComputeMethods {
   public double fToC(double degreesF){
    double degreesC = ((5.0 / 9.0) * (degreesF - 32.0));
    System.out.println("When converted: " + degreesC);
    return degreesC;
   }

   public double hypotenuse (int a, int b){
    double c = Math.sqrt((a * a) * (b * b));
    System.out.println("Hypotenuse: " + c);
    return c;
   }

   public int roll(){
    Random randomNum = new Random();
    int diceOne = randomNum.nextInt(6);
    int diceTwo = randomNum.nextInt(6);
    System.out.println("Dice one returned: " + diceOne);
    System.out.println("Dice two returned: " + diceTwo);
    return diceOne;

   }
}
