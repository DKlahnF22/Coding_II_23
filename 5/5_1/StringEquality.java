import java.util.Scanner;
public class StringEquality {
    public static void main (String[]args){
        //variables
        String userName;
        Scanner sc = new Scanner(System.in);

        //checking name
        System.out.println("Please input name.");
        userName = sc.nextLine();
        sc.close();
        if (userName.contentEquals("Moe")){
            System.out.println("You are the king of rock and roll");
        } else {
            System.out.println("You are not the king");
        }
    }
}
