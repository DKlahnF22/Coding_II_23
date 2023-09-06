import java.util.Scanner;
public class TrafficLightChecker {

    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Input color code.");
      int userInput = sc.nextInt();
      if (userInput == 1){
        System.out.println("Next traffic light is red.");
      } else if (userInput == 2){
        System.out.println("Next traffic light is green.");
      } else if (userInput == 3){
        System.out.println("Next traffic light is yellow.");
      } else {
        System.out.println("Invalid input.");
      }
    }

}