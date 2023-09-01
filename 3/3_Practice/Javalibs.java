    import java.util.Scanner;
    public class Javalibs {
    public static void main(String[]args){
        System.out.println("Hello, my name is R.A.I.N. Please tell me your name.");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello assistant, " +name +", let's begin. Please input the first noun,");
        String noun1 = sc.nextLine();
        System.out.println("now input a second noun,");
        String noun2 = sc.nextLine();
        System.out.println("now input the third noun,");
        String noun3 = sc.nextLine();
        System.out.println("now finally input the last noun.");
        String noun4 = sc.nextLine();
        System.out.println("Excellent. Now please input the first verb,");
        String verb1 = sc.nextLine();
        System.out.println("now the second,");
        String verb2 = sc.nextLine();
        System.out.println("and finally the third.");
        String verb3 = sc.nextLine();
        System.out.println("Only a bit more to go. Now input an adjective,");
        String adjective1 = sc.nextLine();
        System.out.println("now input the second,");
        String adjective2 = sc.nextLine();
        System.out.println("lastly the third.");
        String adjective3 = sc.nextLine();
        System.out.println("Fantastic. Now it is required of me to do some basic math, please give me an integer.");
        String Number1 = sc.nextLine();
        System.out.println("Now give me a double.");
        String Number2 = sc.nextLine();
        System.out.println("Well done. I shall now begin putting your selected words into the Javalibs.");


        sc.close();
        System.out.println("A " +noun1 + " is a type of " +noun2 +",typically " +verb1 +" for one person and consisting of one or more legs,");
        System.out.println("a " +adjective1 +" or slightly angled "+noun2 +" and a back-rest.");
        System.out.println("They may be made of wood, metal, or synthetic materials, and may be " +adjective2 +" or " +adjective3 +" in various colors and fabrics.");
        System.out.println(noun1 +"s vary in design. An " +noun3 +" has armrests " +verb2 +" to the " +noun2 +";");
        System.out.println("a " +noun4 +" is upholstered and features a mechanism that lowers the " + noun1 +"'s back and raises into place a footrest;");
        System.out.println("a " +verb3 +" " + noun1 +" has legs " +verb2 +" to two long curved slats;");
        System.out.println("and a wheelchair has wheels " +verb2 +" to an axis under the " +noun2 +".");

        System.out.println("I also simply added together the integer and double you gave me, the sum is:");
        System.out.println(((double)Integer.parseInt(Number1) + Double.parseDouble(Number2)));
// I love you so so much more
    }
}
