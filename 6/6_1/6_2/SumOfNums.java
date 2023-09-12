import java.util.Scanner;

public class SumOfNums {

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a number (-1 to quit): ");
        int number = console.nextInt();
        do{
            sum += number;
            System.out.println("Enter a number (-1 to quit): ");
            number = console.nextInt();
        }while(number != -1);
        /*while (number != -1) {
            sum = sum + number;     // moved to top of loop
            System.out.print("Enter a number (-1 to quit): ");
            number = console.nextInt();
        }*/
        console.close();
        System.out.println("The sum is " + sum);

    }
}