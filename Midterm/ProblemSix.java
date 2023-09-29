package Midterm;
import java.util.Scanner;
public class ProblemSix {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:");
        int input = sc.nextInt();
        sc.close();
        for(int i = 1; i <= 10; i++){
            System.out.println(input + " x " + i + " = " + (input * i));
        }
    }
}
