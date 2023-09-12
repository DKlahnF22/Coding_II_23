import java.util.Scanner;
public class ProblemTwo {
    public static void main (String[]Args){
      System.out.println("Did tanner take your mousepad?");
      Scanner sc = new Scanner(System.in);
      String mousepad = sc.nextLine();
      sc.close();
    if (mousepad.equals("Yes") || mousepad.equals("yes")){
        System.out.println("TANNER IS STUPID GIVE ME BACK MY MOUSEPAD");
    }  
    }
}
