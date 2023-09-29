package String_Project;
public class StringTester{
    public static void main (String[]args){
        StringProject stats = new StringProject ("This land is your land.");
        System.out.println("Current String: " + stats);
        System.out.println("Current String with reversed case: " + stats.reverseCase());
        System.out.println("Times 'a' appears in the String: " + stats.characterCount('a'));
        System.out.println("String reversed: " + stats.reverseString());
        System.out.println("Each word on a seperate line: " + "\n" + stats.eachWordOnALine());
        System.out.println("Number of words in the String: " + stats.wordCount());
        System.out.println("Number of characters in String: " + stats.characterCount());
        System.out.println("Average word length: " + stats.avgWorldLength());
        System.out.println("Number of vowels in the String: " + stats.vowelCount());
        System.out.println("Number of times that the substring 's' occurs in the String: " + stats.substrCount());
        System.out.println("Your string: " + stats);
        System.out.println("is Palindrome: " + stats.isPalindrome());
        System.out.println("");
        StringProject stats2 = new StringProject("Yo! Banana boy!");
        System.out.println("New string: " + stats2);
        System.out.println("Your new string: " + stats2 + "\nIs it a Palindrome?: " +
stats2.isPalindrome());
    }
}