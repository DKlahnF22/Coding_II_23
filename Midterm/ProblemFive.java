package Midterm;
import java.util.Scanner;
public class ProblemFive {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Input first number:");
    int firstNum = sc.nextInt();
    System.out.println("Input second number:");
    int secondNum = sc.nextInt();
    System.out.println("Input third number:");
    int thirdNum = sc.nextInt();
    System.out.println("Input fourth number:");
    int fourthNum = sc.nextInt();
    sc.close();
    if(firstNum == secondNum && firstNum == thirdNum && firstNum == fourthNum && secondNum == thirdNum && secondNum == fourthNum && thirdNum == fourthNum){
        System.out.println("Numbers are equal!");
    } else {
        System.out.println("Numbers are not equal!");
    }
    }

}
