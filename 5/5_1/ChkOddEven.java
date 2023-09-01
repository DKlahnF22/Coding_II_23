import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:");
        int userNum = sc.nextInt();
        sc.close();
        if ((userNum % 2) == 0){
            System.out.println("Your number is even!");
        } else {
            System.out.println("Your number is odd!");
        }
        
    }
}