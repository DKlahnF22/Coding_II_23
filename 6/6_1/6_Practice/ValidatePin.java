import java.util.Scanner;    
public class ValidatePin{
    public static void main (String[]args){
        int Pin = 1857;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter pin");
        int userInput = sc.nextInt();
        while(userInput != Pin){
            System.out.println("Access denied. Please try again.");
            userInput = sc.nextInt();
        }
        sc.close();
        System.out.println("Access granted.");
    }
}