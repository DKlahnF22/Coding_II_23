    import java.util.Scanner;

public class NameMaker {
    
    public static void main(String args[])
    {
        String firstName;
        String middleName;
        String lastName;
        String fullName;
        Scanner sc = new Scanner (System.in);

        //asking for names
        System.out.println("Hello, it is I. R.A.I.N. Once again.");
        System.out.println("Please input your first name, then middle name, and finally your last name");
        firstName = sc.nextLine();
        middleName = sc.nextLine();
        lastName = sc.nextLine();
        System.out.println("Thank you. Smushing them together now.");
        fullName = firstName + " " + middleName + " " + lastName;
        System.out.println(fullName);
        sc.close();
    }
    
}