import java.util.Scanner;
public class TrafficLightSwitch {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input color code, 1 through 3.");
        int userInput = sc.nextInt();
        sc.close();
        switch (userInput){
            case 1: System.out.println("Next light will be red");
            break;
            case 2: System.out.println("Next light will be green");
            break;
            case 3: System.out.println("Next light will be yellow");
            break;
            default: System.out.println("Invalid input");
        }
       
    }

}