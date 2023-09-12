import java.util.Scanner;

public class ComputeSum {
    public static void main(String[] args) {
        int userNum = 0;
        int userTot = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter 10 numbers");
    System.out.println("Enter 0 to exit");
    for(int i = 0; i <= 9; i++){
        userNum = sc.nextInt();
        userTot += userNum;
        if(userNum == 0){
            break;
        }
    }
    sc.close();
    System.out.println("The total sum is: " + userTot);

    }
}
