package String_Project;
public class StringTester{
    public static void main (String[]args){
        StringProject stats = new StringProject ("This land is your land.");
        System.out.println("Current string: " + stats);
        System.out.println("Current string with reversed case: " + stats.reverseString());
    }
}