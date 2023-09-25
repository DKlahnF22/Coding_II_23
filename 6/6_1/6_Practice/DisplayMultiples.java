import java.util.Scanner;
public class DisplayMultiples {
    public static void main (String[]args){
        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        sc.close();
        for(int i = 1; i <= 12; i++){
            System.out.println(userInput + "x" + i + " = " + (userInput * i));
        }

    }
}
