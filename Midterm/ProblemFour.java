package Midterm;
import java.util.Scanner;
public class ProblemFour {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a value for inch:");
        int inches = sc.nextInt();
        sc.close();
        System.out.println(inches + " inch is " + (inches * 0.0254) + " meters");
    }
}
