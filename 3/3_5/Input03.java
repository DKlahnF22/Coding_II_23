    import java.util.Scanner;
    class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user
        System.out.println("Please input three integers.");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        System.out.println("Total sum: " +((int) input1 + input2 + input3));
        sc.close();
        
        
        //Remember to close the Scanner
        
    }
}