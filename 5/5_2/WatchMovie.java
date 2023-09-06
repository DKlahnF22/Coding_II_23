import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {
        System.out.print("Enter the movie ticket price \n");
        Scanner sc = new Scanner(System.in);
        int moviePrice = sc.nextInt();
        System.out.println("Enter movie rating");
        int movieRating = sc.nextInt();
        sc.close();
        if (moviePrice >= 12 && movieRating == 5){
            System.out.println("I'm interested in watching the movie");
        } else {
            System.out.println("I am not interested in watching the movie");
        }

    }
}