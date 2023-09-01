import java.util.Scanner;


public class ProcessName {
    
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstLetter;
        String lastName;
        System.out.print("Enter your name: ");
        String fullName = sc.nextLine();
        sc.close();
        int spaceIdx = fullName.indexOf(" ");
        int nameLength = fullName.length();
        lastName = fullName.substring(spaceIdx, nameLength);
        firstLetter = fullName.substring(0,1);
        System.out.println(lastName + ", " + firstLetter + ".");
        // your code goes here
        
        
    }
}