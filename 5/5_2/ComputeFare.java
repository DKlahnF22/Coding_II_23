import java.util.Scanner;
public class ComputeFare {

    public static void main(String args[]) {
        System.out.print("Enter the age \n");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int fare = 0;
        sc.close();
        //checking
        if (age > 11 && age < 65){
            fare = 5;
        } else {
            fare = 3;
        }
        System.out.println("Total fare is: " + fare);

    }
}