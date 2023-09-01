import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int userAge;
    boolean drivingUnderAge = false;
    System.out.println("Please input age.");
    userAge = sc.nextInt();
    sc.close();
    drivingUnderAge = userAge <= 18;
    System.out.println(drivingUnderAge);
    }
}